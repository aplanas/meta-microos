SUMMARY = "Shared library for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains the shared library files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libshumate-1_0-1-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "53c7f6787443b19675dd7a18cc13b9080f5fa019a705615b609f481f2e1f602b55062a56a03408170470bd7a0e2be7431ace90e3fd53b75bec8ec94a1e5090e4"

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
