SUMMARY = "Development files for the Qt5 SerialBus library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialbus."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialbus-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "eecd222a3c72e1c5bf62b471950dd77afb084e62cbc89b5a522a5d495d1501c6cab827e39f5e2026eaee6840e41f0427f16552f4f00ec9d0d5efab014f94f399"

RPROVIDES:${PN} += "cmake(Qt5SerialBus) \
libqt5-qtserialbus-devel \
libqt5-qtserialbus-devel(aarch-64) \
pkgconfig(Qt5SerialBus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialBus5 \
pkgconfig(Qt5Core)"

inherit rpm
