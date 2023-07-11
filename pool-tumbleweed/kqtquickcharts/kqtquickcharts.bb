SUMMARY = "Plugin to render beautiful and interactive graphs"
DESCRIPTION = "A QtQuick plugin to render beautiful and interactive graphs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kqtquickcharts-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b9f141530026b257d4db0ab1e192fe28148db1e9cf054915e94bf8be30dd275a256b42f69d4e15bcba31a88bfcf500c07711a75e8eb9061fabe9b499bfcb533d"

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
