SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4a406a8fd506b252340e5beb40efa9bac0fe02deadf9fe5038ad481535c9a1c7e234109753db6c9de8a93e3f35c716a8662e07a71b486ecf5d94f850277f6651"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
