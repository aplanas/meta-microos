SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b500321f0007352b21bcabf6c024dc88885974dc1c653d0722686b3486df2e936af59498c428af61534da98a9482e463c18e35fc61231f34f28ca846203fe8ef"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so \
qt6-datavisualization-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DataVisualizationQml.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
