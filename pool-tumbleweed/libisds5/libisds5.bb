SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds5-0.11.2-1.5.aarch64.rpm"
RPM_HASH = "2e0dbc8db8471fe155ee319b45d9453cdb0d824466b8605e9963202b23aaa2e71368b37caf16696861cf84462b1b312f16c28c92ebc2f7fa328a567023b39da1"

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
