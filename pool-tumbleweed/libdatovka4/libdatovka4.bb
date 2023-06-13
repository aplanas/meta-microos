SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka4-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "e6620930e399df946308bc8a9c20f5724914ae7f507485195071d18c782d2dd81c45a161b6dca99b37daa230a9b37dc3011a8c369db01e09fe4b3b1cb209d543"

RPROVIDES:${PN} += "libdatovka.so.4()(64bit) \
libdatovka4 \
libdatovka4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libgpg-error.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
