SUMMARY = "Development files for the Qt5 SerialPort library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialport."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialport-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "ce61b780df6663fea43670589787b472f72460a7dd4d65f1cc1be58e654398e82829bf5746c08424fba2e5d9349d13e3e31c9393fa1de17d7279e6bba88b3969"

RPROVIDES:${PN} += "cmake-Qt5SerialPort \
libQt5SerialPort-devel \
libqt5-qtserialport-devel \
pkgconfig-Qt5SerialPort"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialPort5 \
pkgconfig-Qt5Core"

inherit rpm
