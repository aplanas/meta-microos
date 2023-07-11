SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "8faf001dde6cd2b965e4bd574b1206dd7445dfcaee758ccfd315956f2034bf4ecb28ee5677075b12429df4cf1953a9ba9cfdd8fdb8106cb9ff03bad57e4c12f6"

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
