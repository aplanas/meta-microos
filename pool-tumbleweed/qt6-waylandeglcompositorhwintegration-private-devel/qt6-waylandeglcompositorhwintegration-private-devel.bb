SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "afb69b9467f2aac80d9e11a8391931ec8acc5e976529800294303fbee0a8fbcbff1e10b179a4100dde2385cb1f83f1e007eafbbbf84809c8f37616423557827b"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
qt6-waylandeglcompositorhwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglCompositorHwIntegration6 \
qt6-waylandcompositor-private-devel"

inherit rpm
