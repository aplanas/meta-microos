SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konsole-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "72549fa2fadbf6d8157009a4ff0b9118d5002383b71cdb6770f5b27202931c2b2807b1a078d5c5586612cd00f826b168fb3ac71a61e3953f0b4b2ed35a299b6e"

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
