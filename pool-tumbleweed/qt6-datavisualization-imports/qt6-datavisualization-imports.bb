SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0c644a2bfe5d48d2fff3c47cb212aac83af7f4191fa181d21072f6859fd5b6079d108ab39514a423dccf806b608f48b90d415fe41cff0b88ab9d6a2507ead8b3"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so \
qt6-datavisualization-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DataVisualizationQml.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
