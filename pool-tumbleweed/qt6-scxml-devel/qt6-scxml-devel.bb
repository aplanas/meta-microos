SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d052bda86c6aafd44549544e33c4a6e09796fe9ad9a6530ab3e96784b49d780e4916b7e3dca235d43fa1db4f4ed24dd1b2b760b5e8a46beb32d9033775e01a17"

RPROVIDES:${PN} += "cmake-Qt6Scxml \
cmake-Qt6ScxmlTools \
pkgconfig-Qt6Scxml \
qt6-scxml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Scxml6 \
pkgconfig-Qt6Core \
qt6-scxml"

inherit rpm
