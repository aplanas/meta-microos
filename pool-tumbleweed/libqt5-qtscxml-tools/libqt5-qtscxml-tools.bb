SUMMARY = "Qt 5 State Chart XML tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains tools for handling Qt SCXML files."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtscxml-tools-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "34c2466cb138b0e4b00de35ff43f6522744b2734ac48150fd89d1782dc97fa09ab0099a2e08abcdb3c269d2e2f0267cc8a86e2931f840cfdeda27f8e08efd373"

RPROVIDES:${PN} += "libqt5-qtscxml-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
