SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "KDE's hotkey daemon module. It allows you to configure custom \
keyboard shortcuts and mouse gestures."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "khotkeys5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d7bfabcfb0f3222c05ed88e0e727e844d63eed343f923b0a2fc9cd24d761dddde05a32e6a25fcdc06b243bf72a84e1c715f2f7f02f700dc59314c9a54a746b4f"

RPROVIDES:${PN} += "khotkeys5 \
khotkeys5(aarch-64) \
libkhotkeysprivate.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KDELibs4Support.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libkworkspace5.so.5()(64bit) \
libm.so.6()(64bit) \
libqt5-qdbus \
libstdc++.so.6()(64bit)"

inherit rpm
