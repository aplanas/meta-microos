SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labssharedimage-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "3f82116f56a67653eabc369459ec62f7c04cbb8a6d98267f7db035de1aa995d259e3081786f0f9bca0d8c95bab228f7dc4bb4e8c9c98ef7c0da8ad26c7c15455"

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
