SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1928434cce106fa3e9966879f8d59099c1656fed68cdec6976f3b9e895a9844cd28aee386ce8ca1fcfa42073efe1ee0d3e4ee3c9fde061f8a738eeca41f10213"

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
