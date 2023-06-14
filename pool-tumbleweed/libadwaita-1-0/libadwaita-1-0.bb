SUMMARY = "Building blocks for modern GNOME applications"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the shared library for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libadwaita-1-0-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "387c1dd7f28a90e1cea31583b6ec5b678043a3b5c55beb822a35802923bfde1fbfe11344a887c7268b40ee2d89b636aa178fe810d34b2d1fc22a0461a7473507"

RPROVIDES:${PN} += "libadwaita \
libadwaita-1-0 \
libadwaita-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
