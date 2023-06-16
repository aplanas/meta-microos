SUMMARY = "Graphical shutdown utility"
DESCRIPTION = "KShutdown is a graphical shutdown utility that works \
with many Desktop Environments. It allows you to turn off \
or suspend a computer at a specified time. It features \
various time and delay options, command-line support, \
and notifications."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "kshutdown-5.2-1.17.aarch64.rpm"
RPM_HASH = "76e36e3fcf1981ed141e032e52209544d604ce1be4152710b7fce01b95ac20f5d85c7499d1c856030272ed0c503a97cb30b94421cff01dcb9c99e07ac86f3f6d"

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
