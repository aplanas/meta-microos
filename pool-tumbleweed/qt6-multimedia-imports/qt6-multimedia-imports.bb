SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e379ee560989f442ac1eedb132458b5c22892d3d086443e0cc0223c288d8585527e81093fbfa1bb9ec2571375c08d09c9c4f84baa92a7c3f3084322ba4058753"

RPROVIDES:${PN} += "libquick3dspatialaudioplugin.so \
libquickmultimediaplugin.so \
qt6-multimedia-imports \
qt6qmlimport-QtMultimedia.2 \
qt6qmlimport-QtMultimedia.5 \
qt6qmlimport-QtMultimedia.6 \
qt6qmlimport-QtQuick3D.SpatialAudio.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6MultimediaQuick.so.6 \
libQt6Qml.so.6 \
libQt6Quick3DSpatialAudio.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
