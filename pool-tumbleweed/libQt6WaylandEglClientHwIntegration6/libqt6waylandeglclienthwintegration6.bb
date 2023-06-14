SUMMARY = "Qt 6 WaylandEglClientHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglClientHwIntegration  library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglClientHwIntegration6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "29d67bb3ad8cc3ebc910a0384a323e9c393c7cb7bb031b7e935e37ad4778bfa0a18006d0d946c1788741fe5bb89cfa2a4d16d8d1ff26394cd02c0df3b44904a2"

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
