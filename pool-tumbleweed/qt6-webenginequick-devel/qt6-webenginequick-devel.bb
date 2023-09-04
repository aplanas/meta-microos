SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginequick-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e31153ab02d5099870728a17469c03fec101a001ca95e109ecd675be8866391aa86f59c5383f295488646b8c503a9a319aee988e2b1bfb6ec85b8e5d45307179"

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
