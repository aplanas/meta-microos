SUMMARY = "Qt 6 WaylandEglClientHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglClientHwIntegration  library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglClientHwIntegration6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d6262aca8610172edf0cf4841bf9bde187a79e8b3660afc626ce2e98ec1018bc968efeb31ee22ac39d5ba5e009117a94a3936b96b64e29562ba766cc8d83f7c4"

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
