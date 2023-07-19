SUMMARY = "Shared library for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains the shared library files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "libshumate-1_0-1-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "35ba6a8e554e507b0637ecc79e3a50c9118717da8556a5b1fe3f500e10b95b1db1ab0a48093677fc3eea655bdf7eab6dd5160a24ab3e0c91e126d938c2f428e4"

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
