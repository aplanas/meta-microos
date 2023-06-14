SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandCompositor6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "de321cac60953f4134051eb9e7cfddc0bbd6c3a26dda3d4233aa648f40ae3b71c25e73a65a6c49fe4d78e257d3b170d19c5711e83f69bcc4d9eba7de65a0bf65"

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
