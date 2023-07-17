SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "3350ab958141c3ea060cb39bf34aa7a1c3d227f0929d0c8823c0a505cbe265c067ba30dee0200c0c4bab573b75da7642558973dd1728a1211247d6071d05a3bb"

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
