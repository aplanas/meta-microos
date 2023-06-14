SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "436098447adeff341f0d77a40f5fc30f6d00af76ad73e7e3bd9c1a89d9066453da217c3d8bd5a342fb39b250928a2ebd5ca0a19591e703736c5a73f8daf6c8db"

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
