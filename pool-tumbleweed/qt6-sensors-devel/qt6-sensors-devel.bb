SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "62b4273c5b9a860d6312133e62387e7b5ecb08a9bb2049a9f10c617e010da9f0118cc3812b78001242c99060aafde71d0aa1014c825f4b2a1ed64e166af0e1f3"

RPROVIDES:${PN} += "cmake-Qt6Sensors \
pkgconfig-Qt6Sensors \
qt6-sensors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sensors6 \
pkgconfig-Qt6Core"

inherit rpm
