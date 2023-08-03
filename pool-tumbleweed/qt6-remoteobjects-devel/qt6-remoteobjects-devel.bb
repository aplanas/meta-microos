SUMMARY = "Qt 6 RemoteObjects library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bb66ee8a5211d70386d791e5a2e0049a7fe1b803a57a7288ed00c2104e98196effc4555b7077cc545379a972d9a482a282d80522468d10cc6f0f2d08f58e1a47"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjects \
cmake-Qt6RemoteObjectsTools \
pkgconfig-Qt6RemoteObjects \
qt6-remoteobjects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Qml \
libQt6RemoteObjects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
qt6-remoteobjects-tools"

inherit rpm
