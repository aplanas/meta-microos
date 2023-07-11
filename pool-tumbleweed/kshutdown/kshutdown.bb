SUMMARY = "Graphical shutdown utility"
DESCRIPTION = "KShutdown is a graphical shutdown utility that works \
with many Desktop Environments. It allows you to turn off \
or suspend a computer at a specified time. It features \
various time and delay options, command-line support, \
and notifications."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "kshutdown-5.2-1.18.aarch64.rpm"
RPM_HASH = "8f7d3a708d7e6b2fb43254d37ca07635ef3a4d61f2c71baf5a7863e4579df1d974f83b1ff03badca8e6b895715c56faba3763eee290fb2d1659fb91869057e5c"

RPROVIDES:${PN} += "kshutdown"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
