SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fdec4cd99ed4827d7a30ca0e87f828b3aa132068bbdfa00742ddb5ef266f0202db8127e266ea82e95b6a767d15429b73b1ce6edd04258ddc04801a5e47aad776"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2 \
pkgconfig-Qt6QuickControls2 \
qt6-quickcontrols2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
