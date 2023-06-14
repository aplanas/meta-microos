SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "05bd8e1b57120e0014336080ddb5f8383dd80993faa17a92baa260964cf9b43454f02041a138af2864fb0fe28cd9b2816b87ba06328a34148c9f55e1714b4934"

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
