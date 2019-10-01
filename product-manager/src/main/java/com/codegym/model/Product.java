package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String country;
    private Double price;

    public Product() {
    }

    public Product(int id, String name, String country, Double price) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
