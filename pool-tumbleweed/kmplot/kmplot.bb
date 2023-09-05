SUMMARY = "Mathematical Function Plotter"
DESCRIPTION = "Mathematical function plotter by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmplot-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "abb33d2e93ef42bd72ed2767f03b4a6692de6da0def86680e6714bbe9dd5bbba4c9d1f60ebb1857bb3c41709a99a6aec1aa807f1c0084bb20f035610d14cabf7"

RPROVIDES:${PN} += "kmplot \
kmplot5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
