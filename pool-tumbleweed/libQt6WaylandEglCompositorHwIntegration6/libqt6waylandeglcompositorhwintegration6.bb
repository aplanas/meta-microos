SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "52ae848e86be9dc747357a5f560d08255cdea72a313e888dc84a08049b5685548b9e90e00f3c6203725f5e12aee082e1fe79faf86d3c72eafcced1d6513d935d"

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
