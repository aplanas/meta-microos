SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fdbed4951d7076283fd5f391c9d809741930cdea0e7c45362690667287ef13ef26a8d480e7e8275dc2cfc751145dc26c2d7144f66dac942a38a3f59070031767"

RPROVIDES:${PN} += "cmake-Qt6Core5Compat \
pkgconfig-Qt6Core5Compat \
qt6-qt5compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Core5Compat6 \
pkgconfig-Qt6Core"

inherit rpm
