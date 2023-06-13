SUMMARY = "QML imports for the Qt5 Data Visualization module"
DESCRIPTION = "This package contains QML import files for Qt5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtdatavis3d-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a6f6d1686ca5d18646400a3a810ed5cf210d9951e818dd7c72079138b9b07a33e7cd04bd83a7a53ccd287372035c48e5bd686decfdc37fac17125c6250a65235"

RPROVIDES:${PN} += "libdatavisualizationqml2.so()(64bit) \
libqt5-qtdatavis3d-imports \
libqt5-qtdatavis3d-imports(aarch-64) \
qt5qmlimport(QtDataVisualization.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DataVisualization.so.5()(64bit) \
libQt5DataVisualization.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
