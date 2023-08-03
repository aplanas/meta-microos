SUMMARY = "Qt 6 WaylandEglClientHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglClientHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandeglclienthwintegration-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f57af0c387359cc18aa010a7596504a0547d98181f21023820e285603ca1e82dbb8b15cfa5645fe3b5cd378d2e051e9884fec427c4eedefd22ebe795ac6651cf"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
qt6-waylandeglclienthwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglClientHwIntegration6 \
qt6-opengl-private-devel \
qt6-waylandclient-private-devel"

inherit rpm
