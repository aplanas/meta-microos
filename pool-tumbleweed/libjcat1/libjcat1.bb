SUMMARY = "Library for reading and writing gzip-compressed JSON catalog files"
DESCRIPTION = "This library allows reading and writing gzip-compressed JSON \
catalog files, which can be used to store GPG, PKCS-7 and \
SHA-256 checksums for each file. This provides  equivalent \
functionality to the catalog files supported in Microsoft Windows."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "libjcat1-0.1.13-1.1.aarch64.rpm"
RPM_HASH = "4a2c626cbc6a1b3c67df7ba13cf21a6666bf84af057df92243150678548b22e6620aa1dc0a6e11e6458e1bbc691f4e84f9b7eeb26ad4c72218fa7112b3a4d8d9"

RPROVIDES:${PN} += "libjcat.so.1 \
libjcat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
libhogweed.so.6 \
libjson-glib-1.0.so.0"

inherit rpm
