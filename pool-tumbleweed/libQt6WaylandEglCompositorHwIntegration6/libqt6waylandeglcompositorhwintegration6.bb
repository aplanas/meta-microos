SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "489b80f372647726513379939a1b5417fd494c6336116d8c9c2b81072fea3406bbd889781d3c17c9acc695cce400cddf023a887da621f690eb439288ca910dd9"

RPROVIDES:${PN} += "libQt6WaylandEglCompositorHwIntegration.so.6 \
libQt6WaylandEglCompositorHwIntegration6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandCompositor.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
