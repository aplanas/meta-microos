SUMMARY = "Filtering proxy for D-Bus connections"
DESCRIPTION = "xdg-dbus-proxy is a filtering proxy for D-Bus connections. It was \
originally part of the flatpak project, but it has been broken out \
as a standalone module to facilitate using it in other contexts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.4"

RPM_NAME = "xdg-dbus-proxy-0.1.4-2.4.aarch64.rpm"
RPM_HASH = "c2577b334a6902687e85cbe6d3c539260b72ed95e960a6a992e0d60a2d6ae611bb63a1d80eeba8f15ae49b27dd8fb89ef9d4ed46a4202046de3c86ee77a1c64b"

RPROVIDES:${PN} += "xdg-dbus-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
