SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "23cafc9ae29228572c257e4aeb00c2d4f1ed5857017557ecf1df25ebe4acf755b37a51cbdb1d66dd03c13652c51f5f30d5c8fb6fd7be529cf15cb744b54fd539"

RPROVIDES:${PN} += "cmake-Qt6QuickShapesPrivate \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
libQt6QuickShapes6 \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
