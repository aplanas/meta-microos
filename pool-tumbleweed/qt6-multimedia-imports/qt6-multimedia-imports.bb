SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "820cdf30d14e64345c709f9129cc655398fe99354204dcd8fa63875b84374892a95a66cc50670533de1059476a0b5194566de6b6ff96a4dfefc43f676587f9c8"

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
