SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "71a8bb3b4023b5acd6a80e7a699629ed01592e867f48c75bcf5415500d0fbad2676deaecf7f8c0a213985bc2d737a6ba9ac0bfa76af3867efda7f523bbcac77d"

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
