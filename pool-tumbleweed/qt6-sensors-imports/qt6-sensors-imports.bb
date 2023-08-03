SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "130720feba05d9cd310d0e08adede30a04b80b85dd9662094538ff9f217543cfbec4388c09d16b61f8304be8661f6f9d06464074269c81b58a2bd37ac596c6a6"

RPROVIDES:${PN} += "libsensorsquickplugin.so \
qt6-sensors-imports \
qt6qmlimport-QtSensors.5 \
qt6qmlimport-QtSensors.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6SensorsQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
