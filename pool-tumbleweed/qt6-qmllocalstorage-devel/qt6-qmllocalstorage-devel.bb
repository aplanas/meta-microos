SUMMARY = "Qt 6 QmlLocalStorage library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmllocalstorage-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "b99d55098508febf17c05f8a81d8e7cf11682033d04e9bb350ed896f2b7715c83d6616bdd0dd2f7c8832f201fdd448e7bec92de1c78f0f89a1191bc196ac0d15"

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
