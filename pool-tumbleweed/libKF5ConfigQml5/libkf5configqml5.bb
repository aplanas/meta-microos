SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ConfigQml5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "359ddbcae301d2601ff249baf0d3ce7f31eb3a6905d84971edcb482e5844210eec5731b10a7fc54b1b77e29b6768467184a438c55fc9a7f3ddf7ee80dd2f2997"

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
