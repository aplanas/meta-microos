SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgcr-4-4-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "dcc1c46dd93e51fb7303359d526ba7514d784d0a654748508485459780cb24b94ec35242a5f32f405d6f9367c97343985d635f226ee8479a0463ce47c4b73bbf"

RPROVIDES:${PN} += "gcr \
libgcr-4-4 \
libgcr-4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
