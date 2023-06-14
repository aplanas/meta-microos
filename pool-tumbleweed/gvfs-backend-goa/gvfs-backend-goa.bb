SUMMARY = "Google disk and GOA functionality for GLib"
DESCRIPTION = "This package provides a gvfs backend that supports Google disk \
and GNOME online accounts integration."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backend-goa-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "8c8996563a724c5a729a0fc79e78269d7b3d835bcf7d6dd555a3e9aea55d7a71e40516d3904361c3acde8043194fc8f6c720634215691861c412a8007a729515"

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
