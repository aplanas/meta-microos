SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandCompositor6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5165720355c4aeedfe6898263a0c989fd3a60171fc8906aaab2614ff1b8fcbcfa25de59e997f49a4e6ede67050629d9c9fac6ea43ccce7089ac9ba75317501be"

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
