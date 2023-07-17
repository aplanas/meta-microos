SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "12f2ada5de35707f36c31a199ff7e2c8d536eed6e254bc008a85d0fd086bb92c55063d3021e79b62b1ed68622e62cee88368e2aa00e0b41cf67065d98538691f"

RPROVIDES:${PN} += "cmake-Qt6Pdf \
pkgconfig-Qt6Pdf \
qt6-pdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Pdf6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
