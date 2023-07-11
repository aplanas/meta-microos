SUMMARY = "Development files for the Qt 5 3D QuickExtras library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickExtras-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "fa1b82bc980b5b8052ccb45967226fb8dda227fb2d972fe4c801ead6fee1fee52e901be6b696366aee26072f0d7e6b4e1ac87d5d5ad8566aa8c10b06039284f2"

RPROVIDES:${PN} += "cmake-Qt53DQuickExtras \
libQt53DQuickExtras-devel \
pkgconfig-Qt53DQuickExtras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickExtras5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DExtras \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DLogic \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
