SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "KDE's hotkey daemon module. It allows you to configure custom \
keyboard shortcuts and mouse gestures."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "khotkeys5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "fb459e72f6b79c99ea55ca7baefd1f484fd6a58d02ccf440d006b6f553c3f89fddba7681a9326a0755ec3a7e238250695f40d9925b7c1854d696ea726920e203"

RPROVIDES:${PN} += "khotkeys5 \
libkhotkeysprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libkworkspace5.so.5 \
libm.so.6 \
libqt5-qdbus \
libstdc++.so.6"

inherit rpm
