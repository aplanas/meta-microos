SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandCompositor6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e088a1e674bb06948e4076f4c7c4232908ad205cb88bc21a9a4e7fe30797a7adf4303c6d0cf1d48b9b61f6f7b5901b3eb2d3d8c8bc1cfb3f566e3d2f45b69658"

RPROVIDES:${PN} += "libQt6WaylandCompositor.so.6 \
libQt6WaylandCompositor6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
