SUMMARY = "Qt 6 RemoteObjectsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjectsqml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "05998bff9a73156bf2a4135e588680b21c157267b0357a44eaf54fd8ae30bc4495bb79c19628cbe38d9f607de63ff40e9ed37d5a6b4c572b60c70595786b5bbd"

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
