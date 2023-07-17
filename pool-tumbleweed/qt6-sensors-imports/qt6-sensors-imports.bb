SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "50181ab3c6a31392c54f6bd67d32eca86d36e93fc545e2bdc0be1762a43ff71bb498dd6c78f4c5564778c36f446329e1fa931446c61c81a17b3f9cf765a2ae4d"

RPROVIDES:${PN} += "libsensorsquickplugin.so \
qt6-sensors-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6SensorsQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
