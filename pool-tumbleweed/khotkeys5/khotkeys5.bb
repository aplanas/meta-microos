SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "KDE's hotkey daemon module. It allows you to configure custom \
keyboard shortcuts and mouse gestures."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "khotkeys5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "6b1c4c6d5572ad0fb2cca58c3c63254a53792fbe05843c17c6082feb5011cbb327b12716821bfd5c935ac8a8aadd9f83b63df17164d50d1a5230897928fbe478"

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
