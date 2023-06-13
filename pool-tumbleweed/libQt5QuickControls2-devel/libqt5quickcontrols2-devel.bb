SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5QuickControls2-devel-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "d2871aada5a4db07e7fe8b47ca7a9fb0c2b1cd989f44bc2c16e5ab8f20060e47cb0f06bd11495878f9c0bbaee767fe596825863aaeb9be29fb50eae89e36c150"

RPROVIDES:${PN} += "cmake(Qt5QuickControls2) \
libQt5QuickControls2-devel \
libQt5QuickControls2-devel(aarch-64) \
pkgconfig(Qt5QuickControls2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5QuickControls2-5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Quick)"

inherit rpm
