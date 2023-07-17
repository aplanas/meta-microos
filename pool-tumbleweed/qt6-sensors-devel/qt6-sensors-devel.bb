SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7e133068f8ed4e6f1c07b12c87acec76da550b49039a3e6061fb9672b9b42575e6e3b2db5393fe9da7a9c31967375f3dfc78b24737dca12fc3e581ca73ed3bb9"

RPROVIDES:${PN} += "cmake-Qt6Sensors \
pkgconfig-Qt6Sensors \
qt6-sensors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sensors6 \
pkgconfig-Qt6Core"

inherit rpm
