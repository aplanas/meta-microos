SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "4560660ecb69028f1ab6367e7b97fe6b9e8cde7524a19a2544eabe4617d35fb5502170397e6773df14ccfe0ef43be26b8dd30d374890e7bd90a33bbdb2d0b5fc"

RPROVIDES:${PN} += "cmake-Qt6QmlLocalStorage \
pkgconfig-Qt6QmlLocalStorage \
qt6-qmllocalstorage-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Sql \
libQt6QmlLocalStorage6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Sql \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
