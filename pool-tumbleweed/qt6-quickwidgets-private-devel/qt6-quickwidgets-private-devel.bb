SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "44f148afcbedb8f71169c132e65a2ee14427d20b9083915cb1d609d72f15b8b3f636a3ce960b801225e229e92cc647852900062a9a2be26f1763d2c837e10f6d"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel \
qt6-quickwidgets-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6QuickWidgets) \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-widgets-private-devel"

inherit rpm
