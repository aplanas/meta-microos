SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "73bb0d122e070c8fac7aeb11dd3d90ea194b93dd425ed36fe7c4a74263d864f0a884d1dbf15d02fd3bc2806f4581d4dd7b0c7d99c2b80f921281a0d750588b60"

RPROVIDES:${PN} += "cmake-Qt6WebEngineQuick \
cmake-Qt6WebEngineQuickDelegatesQml \
pkgconfig-Qt6WebEngineQuick \
pkgconfig-Qt6WebEngineQuickDelegatesQml \
qt6-webenginequick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6WebEngineCore \
libQt6WebEngineQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6WebEngineCore"

inherit rpm
