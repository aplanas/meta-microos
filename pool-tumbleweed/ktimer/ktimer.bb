SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktimer-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "bafb7a819c58e2b6b23d0efeda8e45bea5da8cf7f20e5c8db91070faca28e7c1a73f78e111f1f8042e517f692e790b740ba0a37bfbb70fdb779a589bb39ca78e"

RPROVIDES:${PN} += "ktimer \
ktimer5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
