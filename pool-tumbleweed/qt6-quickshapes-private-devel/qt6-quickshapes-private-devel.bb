SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "5767e3da051fa75ec438d4bfe756d9f0ed8be2842d479f28f1c9f74bce45fb42c0bbae805c374e4e1b18aee440e03138953c359b624a4b58190f9ff0090c7806"

RPROVIDES:${PN} += "cmake-Qt6QuickShapesPrivate \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
libQt6QuickShapes6 \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
