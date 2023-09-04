SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c45950328d80f59d001cf7c8a7fbbd792db84f9813d9a31499767988107b995006e0cf2de54e8c1a4f0d0c93aa19117a479c39f7aa76f592fe8e64e8b24cb40d"

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
