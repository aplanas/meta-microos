SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libQt5WaylandCompositor5-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "2722217140881a52c9e92e4a55db1b9938ca9e2382db9d6cc85d0ba307fe08412304b33d418b01eb19825409a52419810931c83510a303b6792bee9ba2b81ee6"

RPROVIDES:${PN} += "libQt5WaylandCompositor.so.5 \
libQt5WaylandCompositor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
