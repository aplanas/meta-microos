SUMMARY = "Example programs for the Qt 5 Charts Library"
DESCRIPTION = "Examples for Qt5 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtcharts-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "80367233044cef94cb18a5e95d43832f471e33ba035a9ed04ae384636597224747d197159314b8ac79ef1bddb4b7899ebd3a6f390429290b88ace6e652344de8"

RPROVIDES:${PN} += "libqt5-qtcharts-examples \
libqt5-qtcharts-examples(aarch-64)"
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
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtCharts.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.XmlListModel.2)"

inherit rpm
