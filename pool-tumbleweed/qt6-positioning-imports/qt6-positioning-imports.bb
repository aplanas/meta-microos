SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6b7e17f1f76b3a611433d7b42621f98dca65addc29785bc0cbf14a8fce93254111c63c0c5e71b3bcf0b12b8097268dcde24a5744f2edce75cc706e25756d0de0"

RPROVIDES:${PN} += "libpositioningquickplugin.so \
qt6-location-imports \
qt6-positioning-imports \
qt6qmlimport-QtPositioning.2 \
qt6qmlimport-QtPositioning.5 \
qt6qmlimport-QtPositioning.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Positioning.so.6 \
libQt6PositioningQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
