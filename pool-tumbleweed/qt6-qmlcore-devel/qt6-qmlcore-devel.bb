SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "b9b2480930f7e36311473b64014c43203c8b1c3c55417cd29fad31436cd7375102d828a0269282ab5691ce3acd6e53fd3d187a2ab7c0256724b0c04ecddb3bd5"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
