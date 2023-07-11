SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde51"

RPM_NAME = "libQt5WaylandCompositor5-5.15.10+kde51-1.1.aarch64.rpm"
RPM_HASH = "db1730930a9a4aa7aefbdd3e57e21fe358d91f922955177f32d704b8e66d54e4c990112f3763402ce2ee3064365fd5999c20c5be755256dbb3d795236f64b604"

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
