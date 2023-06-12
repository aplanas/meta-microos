SUMMARY = "A GTK+ library to develop UI for mobile devices"
DESCRIPTION = "This package provides the shared library for libhandy, a library to \
help with developing mobile UI using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-1-0-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "9302f21aa4ca95355f187d2cf73b5e38f4f481592d3d331bc69f005fdd2bffc034e52f7ed76ca3a4b77d66ac94ab1906eea845b88653137e9e12ea9f61d339e4"

RPROVIDES:${PN} += "libhandy \
libhandy-1-0 \
libhandy-1-0(aarch-64) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libfribidi.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
