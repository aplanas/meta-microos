SUMMARY = "QML imports for the Qt5 Data Visualization module"
DESCRIPTION = "This package contains QML import files for Qt5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtdatavis3d-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "0534bf8101015a219db39852f15ba4845926ea00a8b91c2a51d228bf3ec6785cb993cee3bf31f9138e609e1869be99364e3a573de4c059b0b08d1c679b824598"

RPROVIDES:${PN} += "libdatavisualizationqml2.so \
libqt5-qtdatavis3d-imports \
qt5qmlimport-QtDataVisualization.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
