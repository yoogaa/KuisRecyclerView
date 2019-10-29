package com.example.kuisrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void tambahData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Yudono Prayoga", "Anak", R.drawable.aku));
        keluargaArrayList.add(new Keluarga("Yudhi Sriwati", "Ibu", R.drawable.ibu));
        keluargaArrayList.add(new Keluarga("Agung Triyoga", "Ayah", R.drawable.bapak));

    }
}
