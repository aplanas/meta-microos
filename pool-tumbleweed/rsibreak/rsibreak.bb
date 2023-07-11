SUMMARY = "Repetetive Strain Injury recovery and prevention assistance utility"
DESCRIPTION = "Repetitive Strain Injury is an illness which can occur as a result of \
working with a mouse and keyboard. This utility can be used to remind \
you to take a break now and then."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.15"

RPM_NAME = "rsibreak-0.12.15-1.5.aarch64.rpm"
RPM_HASH = "1b8a3c06fd4d5cbd1fbffa3f6919a98a07187199f3ef036751b0d1eaced7cf6be63287256067ba47b5cc4bdc35f0c023c46f71db3ea6b84add5d13bba4d2de75"

RPROVIDES:${PN} += "kde4-rsibreak \
rsibreak"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
