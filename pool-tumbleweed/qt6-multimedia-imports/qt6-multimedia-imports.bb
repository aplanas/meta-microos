SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9b03153f0785e02f85c85a8cf0b84d2464a6bd4e5782ce107c1ed27e0eea39ddafe48fbce8a68195d96c98a4b093f13d55ceb5c65f69af25fa15b7370e2aa955"

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
