SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e18c094203b7a69d73b5aceacdee2934ce160b936e55910f4d0af42aa5e34fb049e03a7cc74c88c4ea9997598dbc09963e373550eb5fac0b7b28e7c04430b67e"

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
