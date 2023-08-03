SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labssharedimage-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9e4fe5cce233c69a969899eb85aaa6fd72cae39a49d1c148eed3b06fc4e7c8eaf1825ee30b284340ee01779fa8a5edc19cd66aa11380351f903ccfdfeeed1fa9"

RPROVIDES:${PN} += "cmake-Qt6LabsSharedImage \
pkgconfig-Qt6LabsSharedImage \
qt6-labssharedimage-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsSharedImage6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
