SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "b3eeb344ea30f27c8e1cfe5bfbeabd3d9b3d6ef94d07dbe9d2a0adca740ab313a949c40e22832fa158d4c1fc41bf27ae75ca647c7c3dcef82e422c8c371f528a"

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
