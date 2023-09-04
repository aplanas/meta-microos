SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicklayouts-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7c280945ebe75b04675bf74aa098bcc0d0f78358a0d3f3f58142cec41dc80c9beffca057e32bf3544923b2f1efa43a7eb87753f5aae4b9f001a60722dfb74d66"

RPROVIDES:${PN} += "cmake-Qt6QuickLayouts \
pkgconfig-Qt6QuickLayouts \
qt6-quicklayouts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt6QuickLayouts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
