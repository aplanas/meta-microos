SUMMARY = "Qt6 Quick3DAssetUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "88d07dc682ea21f3969f020004c9f86acea5e69ab1ea0538cf8fe260f225aaaee51d5ce78f25d4405afdee5dbfbcd841e928f5eee355fdf6f508e30afb0d9616"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetUtils \
pkgconfig-Qt6Quick3DAssetUtils \
qt6-quick3dassetutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Quick3DAssetUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel \
qt6-quicktimeline-private-devel"

inherit rpm
