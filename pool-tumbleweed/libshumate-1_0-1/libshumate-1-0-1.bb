SUMMARY = "Shared library for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains the shared library files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-1_0-1-1.0.3-1.4.aarch64.rpm"
RPM_HASH = "8e112e5396698e6bdb438dc2d6170a0512e1b135ea06d7d05739ee4b8f486f60849cd00e0f69992713ba9235055a0c80f0096aac026298e555075d9443454d58"

RPROVIDES:${PN} += "libshumate \
libshumate-1-0-1 \
libshumate-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libprotobuf-c.so.1 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
