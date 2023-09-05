SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konsole-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9db99bdafc64dbbeba4149f36b1845f54c42217e01aaebb0df71d5a439ad43ebc076b17d1cb98a5d77ea6d916b43cbaa455945e070a831ada606bc66c2460765"

RPROVIDES:${PN} += "konsole \
konsole5 \
libkonsoleapp.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
konsole-part \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkonsoleprivate.so.1 \
libstdc++.so.6"

inherit rpm
