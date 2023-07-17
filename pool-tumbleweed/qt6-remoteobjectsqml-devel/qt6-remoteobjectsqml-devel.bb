SUMMARY = "Qt 6 RemoteObjectsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjectsqml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2ece3f79004fa24b1ab81356b1fde09000ce1bf3fda07f778d26efb31597565aff5dfbbc580829c92d0a0fd29f029be7c3320844d698ea936a49e8ce0fadfff4"

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
