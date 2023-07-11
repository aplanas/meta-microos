SUMMARY = "Mathematical Function Plotter"
DESCRIPTION = "Mathematical function plotter by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmplot-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3f34f837a481d1c1f1773c3903f7946098cb6342e0e8b9e7c73dfe3dfdcd779ea09bca551220178d74f4beec7441d07b6fc72715112409dc820c0587824792a3"

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
