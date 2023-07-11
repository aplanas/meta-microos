SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "7ec657adb5450ad013451127611e4d584ab05f30e472723ffd5e619ba24b87cd0ebe3bfeaf990f27c16d4a3f69bebadc917c9ced3ea7371130255314f8722142"

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
