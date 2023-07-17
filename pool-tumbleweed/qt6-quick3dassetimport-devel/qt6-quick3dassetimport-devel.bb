SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b72a94b83d591dbce431d9b4b7610372907a440dec8ef3afe147bf51e2b9add841a914defd8eca797bccdc5ed2fbdce9039bac9de031565c10577f124b143b1a"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DAssetImport \
qt6-quick3dassetimport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick3DUtils \
libQt6Quick3DAssetImport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick3DUtils"

inherit rpm
