SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "729df4d5746648f5e29d8979efc0792a7fa651edb633295769f14a535ca06a8c73e096282d37469d042a1eae71317a32440b987f87b32a1bf1188eb5c811c37b"

RPROVIDES:${PN} += "cmake-Qt6QuickParticlesPrivate \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel"

RDEPENDS:${PN} += "libQt6QuickParticles6 \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
