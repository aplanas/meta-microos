SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "867d8c274859e0e9a55520d612fd7a7c014dff9b544d8aa29561b798c5908140acc3a8632190a2fcf62da3151f71418b33d4cfe6c17c231ba1d553d35b802038"

RPROVIDES:${PN} += "cmake-Qt6QuickWidgets \
pkgconfig-Qt6QuickWidgets \
qt6-quickwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Widgets \
libQt6QuickWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Widgets \
qt6-opengl-private-devel"

inherit rpm
