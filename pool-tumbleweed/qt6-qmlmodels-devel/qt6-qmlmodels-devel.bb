SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlmodels-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "61553bd9c11efc3e5cc006cfa9e768b8cc50a8cadac1af7aac3972db6d71a9b8572cabaee55257e7509167a39ca1ebc32e24ffacef8f9149d20641cb2c169b76"

RPROVIDES:${PN} += "cmake-Qt6QmlModels \
pkgconfig-Qt6QmlModels \
qt6-qmlmodels-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6QmlModels6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
