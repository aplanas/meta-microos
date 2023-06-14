SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c019b17c5f46cea09318ddb23091ea4470f1763873c50f9e42a8a5c59b34ff991f6f85d79a82486d38d5b76572f15da02da69c02bf15fc96f0d78380f7d5cccc"

RPROVIDES:${PN} += "libsensorsquickplugin.so \
qt6-sensors-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6SensorsQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
