SUMMARY = "Development files for the Qt5 WebEngine library"
DESCRIPTION = "You need this package if you want to compile programs with Qt WebEngine."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-devel-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "7c14fd1f55f457d7e824e106bdd668640d5edca5e5c87dc3032944ee5604ae1806c2ee8ac9abaee1c9285fc4968b4f6c596e9a0e52fdeb2f8d0fcd19716f5cf7"

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
