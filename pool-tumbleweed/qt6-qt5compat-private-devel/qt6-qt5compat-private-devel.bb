SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a7b37c5d23a6cb070130ab71ff6b93bf34178880072172bdac8314eca840415e85f081e68d00a3e1690ba2a00b768acd6e80f1229c31a5ac7d48c3dea3aca85b"

RPROVIDES:${PN} += "qt6-qt5compat-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core5Compat \
qt6-core-private-devel"

inherit rpm
