SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "77a8e1d0b92e304f890f5cb75833afb084f7318e5481293fb0d80f0fe228099d21cefb66011528857a46c32dd9155ffc19015cd6430fe84cb033792d75513a88"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2 \
pkgconfig-Qt6QuickDialogs2 \
qt6-quickdialogs2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickDialogs2Utils \
libQt6QuickDialogs2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
