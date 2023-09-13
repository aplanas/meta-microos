SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konsole-23.08.0-2.1.aarch64.rpm"
RPM_HASH = "91662103432444ef83676116642f8351a0e2b8a772fae1ef7a6c9c7705192ca5dd5267999a11e6cc5201a01cf8574de3e5ec6a2fefd5c8bdce3e308e467b117b"

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
