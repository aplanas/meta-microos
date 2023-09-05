SUMMARY = "Plugin to render beautiful and interactive graphs"
DESCRIPTION = "A QtQuick plugin to render beautiful and interactive graphs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kqtquickcharts-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0816a4e3ce996ae1e71490fba777309dbe86af8710effba610e2d781bc4c8caf80bec0e24155a4fece6ae3da6df70f766a72b789af3c0a603011b275a5008c4c"

RPROVIDES:${PN} += "cmake-KQtQuickCharts \
kqtquickcharts \
libkqtquickcharts.so \
qt5qmlimport-org.kde.charts.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.charts.0"

inherit rpm
