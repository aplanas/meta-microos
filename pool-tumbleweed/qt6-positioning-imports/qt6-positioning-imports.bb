SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2ab6f05a8a11a30932a6124a36677688d9074f7db289cf66ceb7550488b6a8711b39fd4cf2fd7631ac10daff6480a50137b323d24ab82af4a1bf9255981ace00"

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
