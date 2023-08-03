SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "121fb320895b6676f39d9334a1c9c1ee2cfc88ba5c379b4a4c030ce48d15282187ae759fd996fa3abee64c4de99b378390e0d20ee8438b554cb907cca8ac9b9a"

RPROVIDES:${PN} += "cmake-Qt6Quick \
pkgconfig-Qt6Quick \
qt6-quick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
libQt6Quick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels"

inherit rpm
