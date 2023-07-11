SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package, if you want to compile programs with qtdeclarative."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde26"

RPM_NAME = "libqt5-qtdeclarative-devel-5.15.10+kde26-1.1.aarch64.rpm"
RPM_HASH = "4a99a5b07c755b74318230e9e7c928b7c49b31b39d995247d45470e5dc2d04c8d97f6f65efc5455ceb603329aa6f75be3df9ebcd38d244e90c976f636e69e518"

RPROVIDES:${PN} += "cmake-Qt5PacketProtocol \
cmake-Qt5Qml \
cmake-Qt5QmlDebug \
cmake-Qt5QmlDevTools \
cmake-Qt5QmlImportScanner \
cmake-Qt5QmlModels \
cmake-Qt5QmlWorkerScript \
cmake-Qt5Quick \
cmake-Qt5QuickCompiler \
cmake-Qt5QuickParticles \
cmake-Qt5QuickShapes \
cmake-Qt5QuickTest \
cmake-Qt5QuickWidgets \
libQt5Quick-devel \
libqmltestplugin.so \
libqt5-qtdeclarative-devel \
pkgconfig-Qt5Qml \
pkgconfig-Qt5QmlModels \
pkgconfig-Qt5QmlWorkerScript \
pkgconfig-Qt5Quick \
pkgconfig-Qt5QuickTest \
pkgconfig-Qt5QuickWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTest.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libQtQuick5 \
libc.so.6 \
libqt5-qtdeclarative-tools \
libstdc++.so.6 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network \
pkgconfig-Qt5Qml \
pkgconfig-Qt5QmlModels \
pkgconfig-Qt5Quick \
pkgconfig-Qt5Test \
pkgconfig-Qt5Widgets"

inherit rpm
