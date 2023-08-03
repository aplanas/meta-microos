SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavisualization-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6d04f976f6350a34bfd4f6db3b88a7c39789798e5b691869847f0dbfa335c90a948b705e61e21bcb112b706d2f6d4a1daddd53b5807682de680e8304c359b236"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so \
qt6-datavisualization-imports \
qt6qmlimport-QtDataVisualization.1 \
qt6qmlimport-QtDataVisualization.2 \
qt6qmlimport-QtDataVisualization.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DataVisualizationQml.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
