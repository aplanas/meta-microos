SUMMARY = "Qt 6 WaylandEglClientHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglClientHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglclienthwintegration-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2a8f83b00e311d86c2861c1689057c270fac1e6d4a5d8756851701325bbe84b422a6f01617f0091f42822d79fa9abc6298e343ce9d42bcf87b62010b5d0c8619"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
qt6-waylandeglclienthwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglClientHwIntegration6 \
qt6-opengl-private-devel \
qt6-waylandclient-private-devel"

inherit rpm
