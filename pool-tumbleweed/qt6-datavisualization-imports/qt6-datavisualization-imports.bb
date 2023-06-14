SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "aa19d9c8029906ed96c157238529c48a2f9bf676ccf4f0c087b6a2624df85797748d5bb0d7ecd115d8a238656ae87e23fc28023dd6cdc869de02a4b975e7a6b2"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so \
qt6-datavisualization-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DataVisualizationQml.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
