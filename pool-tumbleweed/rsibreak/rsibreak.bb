SUMMARY = "Repetetive Strain Injury recovery and prevention assistance utility"
DESCRIPTION = "Repetitive Strain Injury is an illness which can occur as a result of \
working with a mouse and keyboard. This utility can be used to remind \
you to take a break now and then."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.15"

RPM_NAME = "rsibreak-0.12.15-1.4.aarch64.rpm"
RPM_HASH = "42b32da48dc04ca82fc659a275e73c5e1a4962558118f8a9280011e50852c5769303b01d96c7e33adfc828aeb778927ceb26d5de7f4fb34400acf30b18c598ee"

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
