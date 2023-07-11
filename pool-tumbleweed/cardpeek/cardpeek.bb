SUMMARY = "Tool To Read Contents of ISO7816 Smart Cards (Credit Cards, GSM SIM etc"
DESCRIPTION = "Cardpeek is a Linux tool to read the contents of ISO7816 smart cards. \
It features a GTK GUI to represent card data is a tree view, and is \
extendable with a scripting language (LUA). \
 \
The goal of this project is to allow smart card owners to be better \
informed about what type of personal information is stored in these \
devices. \
 \
The tool currently reads the contents of: \
    * EMV cards \
    * Calypso public transport cards (such as Navigo) \
    * Moneo ePurse cards \
    * Vitale 2 French health cards. \
    * GSM cards (beta) \
 \
See /usr/share/doc/packages/cardpeek/cardpeek_ref.en.pdf for more details."
LICENSE = "GPL-3.0"

PV = "0.8.4"

RPM_NAME = "cardpeek-0.8.4-5.17.aarch64.rpm"
RPM_HASH = "27566aa3e46285fa089e37a6fef426ed9b2318a924e923e4b3f919dac3ee04e5455d97ebed901edcb0c8d9695d9e68e7d3a6be10c960401aa0f578928d8aaa0f"

RPROVIDES:${PN} += "cardpeek"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libpango-1.0.so.0 \
libpcsclite.so.1 \
libreadline.so.8 \
libssl.so.3"

inherit rpm
