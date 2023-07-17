SUMMARY = "Development files for the Qt5 WebEngine library"
DESCRIPTION = "You need this package if you want to compile programs with Qt WebEngine."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-devel-5.15.14-1.4.aarch64.rpm"
RPM_HASH = "8befe4ba5139977babc30b5b2cc48d7954027e2c8ef492790d8a86e001a82932b813245a88f06999e1716ae4c885cea65f5e2cd6d04b9c7b56cea25cff5782fc"

RPROVIDES:${PN} += "cmake-Qt5WebEngine \
cmake-Qt5WebEngineCore \
cmake-Qt5WebEngineWidgets \
libqt5-qtwebengine-devel \
libqwebengineview.so \
pkgconfig-Qt5WebEngine \
pkgconfig-Qt5WebEngineCore \
pkgconfig-Qt5WebEngineWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtwebengine \
libstdc++.so.6 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick \
pkgconfig-Qt5WebChannel \
pkgconfig-Qt5WebEngineCore \
pkgconfig-Qt5Widgets"

inherit rpm
