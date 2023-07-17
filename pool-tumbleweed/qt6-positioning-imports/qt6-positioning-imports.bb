SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "eea28b437bbda1a108e4302087849de39abdd3d84c88c7c776928830d23aa843d2d3f83a74152534a44215daa83d3dfec65977744aeb71850892551b034f1ed1"

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
