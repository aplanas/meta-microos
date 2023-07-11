SUMMARY = "Google disk and GOA functionality for GLib"
DESCRIPTION = "This package provides a gvfs backend that supports Google disk \
and GNOME online accounts integration."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-backend-goa-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "e351f413c3f2240a09cb5ca42a50ee77a04e4594230476354be2cd3acf6d528e337b8aa3fa4313567bdf6e1c8f79dd14aaad33e5bcb1d78d3aeacb7c90372491"

RPROVIDES:${PN} += "gvfs-backend-goa"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdata.so.22 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so"

inherit rpm
