SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2fb3bb6df1d42b09d1dfec991d16d2472cce2e778d7e26a56537da8f5e975df9e42aeb55d2d4263536b41a1c88821187a07f348b5c161edb72e2a25c8bca5f6e"

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
