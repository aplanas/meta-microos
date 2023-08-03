SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dassetimport-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0a56e59515cd3718f91a8e226bec86b61c7a8db0fa02f02e33f48442d957aab9b806c0baf3d129237c09a3314eca7ace5726d9157f8d97358e713479505eb62c"

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
