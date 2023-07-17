SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a065142e1331349f78cf1c9f6c89a0fd7b52d676636076c854504a9979f209f62c01acfc94d29d750dbb64a4c5d0e8797457fdea2c67f23ef009937033d7548c"

RPROVIDES:${PN} += "cmake-Qt6QuickParticlesPrivate \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel"

RDEPENDS:${PN} += "libQt6QuickParticles6 \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
