SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dassetutils-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "83c2a2bad87900f5b39de0088a135f64b2df17b9ef84484dc8faf76b4a8f7e7be04c00410ae4873a3f8d6ebb33bc22f762b48b856f0daf5e7926a8384f0d35cb"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetUtils \
pkgconfig-Qt6Quick3DAssetUtils \
qt6-quick3dassetutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6QuickTimeline \
libQt6Quick3DAssetUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
