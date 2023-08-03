SUMMARY = "Qt 6 Charts QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "59b3149d3af43dbf839a1909311191a46b679bcec124dc661b27ac86aa6f6a6099742b9d72eae108df65ea388708702788c9b0cb9ff1ea03dbe6ef131178bee0"

RPROVIDES:${PN} += "libqtchartsqml2plugin.so \
qt6-charts-imports \
qt6qmlimport-QtCharts.1 \
qt6qmlimport-QtCharts.2 \
qt6qmlimport-QtCharts.6"

RDEPENDS:${PN} += "libQt6ChartsQml.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
