SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5d7b13f6195d63c30c1a7c96671c9477c65258ebc98cf01c03f2d554e35e57cd028f4e2cd18c5a3f3190d0876be02923951e57dd8ba21563bbabe6eaffe946da"

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
