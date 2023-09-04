SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "15eb95666a6c2c00beb025287ba51287337789b3337b696e763b2ced3a08ec0a2849c6d2bc8335c1bf7a7743ec16c98e10cf1df04b0012bd0562ad162aa1e0d4"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2Impl \
pkgconfig-Qt6QuickControls2Impl \
qt6-quickcontrols2impl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2Impl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
