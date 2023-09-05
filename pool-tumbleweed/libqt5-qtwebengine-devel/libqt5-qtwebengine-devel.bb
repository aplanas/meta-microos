SUMMARY = "Development files for the Qt5 WebEngine library"
DESCRIPTION = "You need this package if you want to compile programs with Qt WebEngine."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtwebengine-devel-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "bee714bfa9c799d0c6c8ff6d401a77edb2e8eee1abaaf7f83188bfc6f7502916f083e06a0a003305b89eaf01627d3ebc5a75398beaabf442c209c3b6639840d9"

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
