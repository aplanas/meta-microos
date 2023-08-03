SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WaylandCompositor6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8c82b84e52b0a7ddba264f4209103b251612bb905875312144d5ad1f6d76c14a353055836db0172576d0d16317b0265c58287ee8105fead89d43a82db214d9c1"

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
