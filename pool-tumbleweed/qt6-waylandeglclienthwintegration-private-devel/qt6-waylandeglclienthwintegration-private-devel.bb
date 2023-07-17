SUMMARY = "Qt 6 WaylandEglClientHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglClientHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandeglclienthwintegration-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "02ce2ba2ef7a82dcbed58f77b019a710d572aa09d764d674563a4e3659b4cd865a96e1fed54a482bea346b3d9127f1d8fbbe50aa19959c94b31535daa50a2054"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
qt6-waylandeglclienthwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6WaylandEglClientHwIntegration6 \
qt6-opengl-private-devel \
qt6-waylandclient-private-devel"

inherit rpm
