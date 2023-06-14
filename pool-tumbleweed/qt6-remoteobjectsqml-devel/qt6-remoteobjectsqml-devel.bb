SUMMARY = "Qt 6 RemoteObjectsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjectsqml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "149e8be04426f4b4c827e45da78a12aa57378f699d939073197ff48859a6085ed2c6ebea96ebf3e7281c98f0cabf93c43100449506cca7139033fa5b59d0792b"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjectsQml \
pkgconfig-Qt6RemoteObjectsQml \
qt6-remoteobjectsqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6RemoteObjects \
libQt6RemoteObjectsQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6RemoteObjects"

inherit rpm
