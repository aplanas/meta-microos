SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "553ed650ec5d83ffc0485161c5f851e5cc7d6359398893360394d6362386e5828ef1aa004eee8d6656215b66001ec0eb06102f970c534dd76d4ef52938c04f36"

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
