SUMMARY = "Shared library for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains the shared library files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-1_0-1-1.0.3-1.3.aarch64.rpm"
RPM_HASH = "033086c0df79223a66934e5bdedc8b03b9ae34f39c44e7d6433277c80ecddcb69908782643c9c6a89eb652da72daf759575697cda4dae3324926ee2ce6ce9848"

RPROVIDES:${PN} += "libshumate \
libshumate-1.0.so.1()(64bit) \
libshumate-1_0-1 \
libshumate-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
