SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "bb724678ce64d644778ada1d8d7dc7ca87b6934520d99a0e7b2748111d2733abc57dc51b09fcc3ae4823aaeadf61b7952cb070e18c1ac7f3763a1743961ec938"

RPROVIDES:${PN} += "cmake-Qt6LabsSettings \
pkgconfig-Qt6LabsSettings \
qt6-labssettings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6LabsSettings6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
