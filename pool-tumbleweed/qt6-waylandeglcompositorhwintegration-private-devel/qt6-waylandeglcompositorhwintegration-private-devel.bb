SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e81ddb59bf8da06baebb6a8c1f0c013fbea97e458d4025b22448089c119271c73e5e039e6d9f148e2a167a9cc54ad56ef978981aa5e59391f43e32afe9cb3a9f"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
qt6-waylandeglcompositorhwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglCompositorHwIntegration6 \
qt6-waylandcompositor-private-devel"

inherit rpm
