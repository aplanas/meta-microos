SUMMARY = "A GTK+ library to develop UI for mobile devices"
DESCRIPTION = "This package provides the shared library for libhandy, a library to \
help with developing mobile UI using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-1-0-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "9302f21aa4ca95355f187d2cf73b5e38f4f481592d3d331bc69f005fdd2bffc034e52f7ed76ca3a4b77d66ac94ab1906eea845b88653137e9e12ea9f61d339e4"

RPROVIDES:${PN} += "libhandy \
libhandy-1-0 \
libhandy-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
