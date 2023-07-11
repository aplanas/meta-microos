SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "fef17e413dc560e5558b29a83c45d0e1f5a70cabca4499e866020cb983fff904dc1948578ad8b062a173f95c769661059b84bd52a8baccff156ba810f9ee0559"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DAssetImport \
qt6-quick3dassetimport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick3DUtils \
libQt6Quick3DAssetImport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick3DUtils"

inherit rpm
