SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicklayouts-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "975c2e35e1a412f39e3141709bc6e17abd78223e168bb53e00d25b1136fa50f8c2d826439401bfdf0fbe7466f4afe74acd0e9d5cc9aadbb6350238a10ac65fc5"

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
