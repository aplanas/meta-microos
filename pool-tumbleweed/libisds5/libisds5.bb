SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds5-0.11.2-1.4.aarch64.rpm"
RPM_HASH = "9a0409db7436009c0f8086a2e12dff680d1c9af3e6d153b25632d35eead6d489f2d4339e7e6e827d35cc7f8e5b1b9d6a814f3200e710c1412f7d885357edbd06"

RPROVIDES:${PN} += "libisds.so.5 \
libisds5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libgpgme.so.11 \
libxml2.so.2"

inherit rpm
