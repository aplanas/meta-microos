SUMMARY = "Development files for the Qt5 SerialPort library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialport."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialport-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "530efadd2b5887630616e9fe50e0fbab182d041ef885995ba92ef1e0a7ae5e3d1f24900233d102f0904b939f477e36cd9c3ed92b1c38c6f37282f7ef0b07656a"

RPROVIDES:${PN} += "cmake-Qt5SerialPort \
libQt5SerialPort-devel \
libqt5-qtserialport-devel \
pkgconfig-Qt5SerialPort"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialPort5 \
pkgconfig-Qt5Core"

inherit rpm
