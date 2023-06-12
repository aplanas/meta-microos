SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c42e340c43de19724fcdf230506b59de3f3622691feb6cd3c3abd169aab136e92f90bf9fc7469e6c0854f346a191ac8ad68ddfcee2c54701daa8fcdf402c3fe7"

RPROVIDES:${PN} += "cmake(Qt6WaylandEglCompositorHwIntegrationPrivate) \
qt6-waylandeglcompositorhwintegration-private-devel \
qt6-waylandeglcompositorhwintegration-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) \
libQt6WaylandEglCompositorHwIntegration6 \
qt6-waylandcompositor-private-devel"

inherit rpm
