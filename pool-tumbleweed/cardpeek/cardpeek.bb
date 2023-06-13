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

RPM_NAME = "cardpeek-0.8.4-5.16.aarch64.rpm"
RPM_HASH = "c96153cdd6cf7ee802e3a149c0f5bd5d6f9104a7adf2289b0724bcb9566e34fc9adbdebfa5aaac96347fb98e8c9a9884d017604811fb748de84b43e3fc118a26"

RPROVIDES:${PN} += "application() \
application(cardpeek.desktop) \
cardpeek \
cardpeek(aarch-64) \
metainfo() \
metainfo(cardpeek.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libpango-1.0.so.0()(64bit) \
libpcsclite.so.1()(64bit) \
libreadline.so.8()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
