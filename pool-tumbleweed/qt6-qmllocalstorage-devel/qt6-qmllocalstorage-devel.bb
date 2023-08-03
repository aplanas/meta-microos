SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4c6ae387387dbc30c6399a90f43c9f021961d90a97c286172297998c7cd763b54eb47a0b4944136b02a0adbe5eea6cd3201cd9279a191596bd876986153064f1"

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
