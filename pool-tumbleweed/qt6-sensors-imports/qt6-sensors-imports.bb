SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "aebd36fa2050b12dc29bc0980323506bfee5941b6d665fe101250073f7e95a54312696528ec2cc57e59162e6218442fe5d7fcf7bd4b4f9f5173f43ba59fde1d7"

RPROVIDES:${PN} += "libsensorsquickplugin.so \
qt6-sensors-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6SensorsQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
