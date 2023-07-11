SUMMARY = "QML imports for the Qt 5 Charts Library"
DESCRIPTION = "This package contains QML import files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtcharts-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c5c9633f97d671b71e82d39ef870dcae45d72db9d4f8dbd81465b760e9199aeca6322c69a41e2e97697f8468a6fcc431d342710cf8132b09e47b3d1abcf7494d"

RPROVIDES:${PN} += "libqt5-qtcharts-imports \
libqtchartsqml2.so \
qt5qmlimport-QtCharts.1 \
qt5qmlimport-QtCharts.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
