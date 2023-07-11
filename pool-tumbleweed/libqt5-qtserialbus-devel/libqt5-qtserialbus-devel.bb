SUMMARY = "Development files for the Qt5 SerialBus library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialbus."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialbus-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d62c2c07013e84b680bffa730940b0c9c0580f915f07d4663372fb892a98fef384a12265211c8478a7ed417b75bdf4a298b0e1cc4627c93c824b376d9f06b171"

RPROVIDES:${PN} += "cmake-Qt5SerialBus \
libqt5-qtserialbus-devel \
pkgconfig-Qt5SerialBus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialBus5 \
pkgconfig-Qt5Core"

inherit rpm
