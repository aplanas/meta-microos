SUMMARY = "Qt 6 WaylandEglClientHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglClientHwIntegration  library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglClientHwIntegration6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "83c8e00d669aa5cdfcfc71b8225cc364b909bb3fab49b476bc841dfb0da6135f3a5e3f6960993b47dfa3dd69c6c29b9b241ef1129f7ba9dec4cf6110dd50e9be"

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
