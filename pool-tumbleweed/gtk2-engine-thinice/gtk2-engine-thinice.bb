SUMMARY = "ThinIce GTK+ 2 Theme Engine"
DESCRIPTION = "The ThinIce engine features thin edges and Icy Colors, and provides a \
simple mostly clean appearance many find satisfying."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-thinice-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "6e8589b85243757ae8c8a279202be8c0d8c21a01b633ab5c899ba4c9aac6bceaaf00085cccd07ddf233f8324875327e43438070d9cb1dd3b38e56e7c8b2f56a2"

RPROVIDES:${PN} += "gtk2-engine-thinice \
libthinice.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
