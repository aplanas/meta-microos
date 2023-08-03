SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b17468087d3459d3465802b3ec72e8b85a8ce8b8b224d0ca7bcff3b7cbceead7d44507e7a2fb3ef1b38b20250f6d63462823be92ea12c14b1b9419612f21e4f0"

RPROVIDES:${PN} += "cmake-Qt6Sensors \
pkgconfig-Qt6Sensors \
qt6-sensors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sensors6 \
pkgconfig-Qt6Core"

inherit rpm
