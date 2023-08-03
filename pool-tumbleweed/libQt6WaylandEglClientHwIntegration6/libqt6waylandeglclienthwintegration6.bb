SUMMARY = "Qt 6 WaylandEglClientHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglClientHwIntegration  library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WaylandEglClientHwIntegration6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "910dcc43b77bf13250490097adec2b5db14b30c50158f12883e633b41fbe2712b88ec99dc4b0c11fb0a252f44a93b769d79710627a5b3626eb4f6a0f00a64942"

RPROVIDES:${PN} += "libQt6WaylandEglClientHwIntegration.so.6 \
libQt6WaylandEglClientHwIntegration6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1"

inherit rpm
