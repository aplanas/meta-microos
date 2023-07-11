SUMMARY = "Building blocks for modern GNOME applications"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the shared library for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libadwaita-1-0-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "e8eb1f13d0e52114e15961c7e6fbb4c9c01317f75356f9318892cf71ee9c6c630ebeceaaa8c5d3156866d738aa1701302b1195d8ec5c3c84863b10f73a091305"

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
