SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ConfigQml5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "005d43c4c704641bc1afec1ea56b1102b7d0068006688c251da316f2a6032c29e12451a1e12aaf5a35fdd79daec9c9e56b984c60239b0b44c5a902b6f5820a53"

RPROVIDES:${PN} += "libKF5ConfigQml.so.5 \
libKF5ConfigQml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
