SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "8e85ea3ed3d141c6c113fb22022a80daa29bceb0a809f52dbe59fc40b6d7f3c8b50957bc8ce06efa964f335e279391e36ec0f3c7b43e859e0ec7333bf53992c3"

RPROVIDES:${PN} += "cmake-Qt6WebEngineQuick \
cmake-Qt6WebEngineQuickDelegatesQml \
pkgconfig-Qt6WebEngineQuick \
pkgconfig-Qt6WebEngineQuickDelegatesQml \
qt6-webenginequick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6WebEngineCore \
libQt6WebEngineQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6WebEngineCore"

inherit rpm
