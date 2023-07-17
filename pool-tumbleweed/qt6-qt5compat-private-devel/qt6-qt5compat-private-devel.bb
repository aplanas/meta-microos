SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2d73d139dacbdd91b093a4061ea1b2c78817d61d5d3dbdb47bf18eda3f51c46790c8bae748ca283cae7ac0f781b6b3a1fa7439f41f6dc7c41859e8ffb1107fc3"

RPROVIDES:${PN} += "qt6-qt5compat-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core5Compat \
qt6-core-private-devel"

inherit rpm
