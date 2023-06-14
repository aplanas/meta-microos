SUMMARY = "QML imports for the Qt5 Data Visualization module"
DESCRIPTION = "This package contains QML import files for Qt5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtdatavis3d-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a6f6d1686ca5d18646400a3a810ed5cf210d9951e818dd7c72079138b9b07a33e7cd04bd83a7a53ccd287372035c48e5bd686decfdc37fac17125c6250a65235"

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
