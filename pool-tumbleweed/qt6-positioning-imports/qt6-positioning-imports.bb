SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1d209466be828173965c01142d546f653d744c511e2f64d6fa075e04bb3f354146dd1e9533e60c42ab16ae4550aef250b6a93cef0418b47b9f75a244b5643f46"

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
