SUMMARY = "QML port of qtermwidget"
DESCRIPTION = "This project provides a Unicode-enabled, embeddable QML widget for \
using as a built-in console (or terminal emulation widget)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "qmltermwidget-0.2.0-2.16.aarch64.rpm"
RPM_HASH = "4f2e8341b7601c5b8bb8260a8dcaedab61c5acaf0e16d626fe67598389442913cfae0fd543b783e81d2fdd33223a2d7f18be1177a47ad4f87c66631739b19cd4"

RPROVIDES:${PN} += "libqmltermwidget.so()(64bit) \
qmltermwidget \
qmltermwidget(aarch-64) \
qt5qmlimport(QMLTermWidget.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qt5qmlimport(QMLTermWidget.1) \
qt5qmlimport(QtQuick.2)"

inherit rpm
