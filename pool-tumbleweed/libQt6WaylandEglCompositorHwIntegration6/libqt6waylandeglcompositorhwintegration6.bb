SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "182e4c5c48be1980fd945fed19895c29424aa3fbb7675a0c1e2d25bdd2786f1497a47fb2d5f65f473ab68617ee7423f7d5b22b608397b4b2244a4876853f14ff"

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
