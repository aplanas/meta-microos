SUMMARY = "QML imports for the Qt 5 Charts Library"
DESCRIPTION = "This package contains QML import files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtcharts-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "b2ea311b71e2735ea08e828d44bc89cd3cf2e7c12cfec63bc8c6f19102f06ea6a74278eded05d71836349c77ea47b606cfadfe042e542e7ab21cf4113b2b0c21"

RPROVIDES:${PN} += "libqt5-qtcharts-imports \
libqt5-qtcharts-imports(aarch-64) \
libqtchartsqml2.so()(64bit) \
qt5qmlimport(QtCharts.1) \
qt5qmlimport(QtCharts.2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Charts.so.5()(64bit) \
libQt5Charts.so.5(Qt_5)(64bit) \
libQt5Charts.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Charts5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
