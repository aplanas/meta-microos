SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1a8c9d61fdd82f60a6d58b5f4de76083509b7076c9cf66b5a2430676dce3e5bea654189589a6aaae8e983aa713d3c575aba1ddf08e60f66d6f3245d231c9e82e"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
qt6-waylandeglcompositorhwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglCompositorHwIntegration6 \
qt6-waylandcompositor-private-devel"

inherit rpm
