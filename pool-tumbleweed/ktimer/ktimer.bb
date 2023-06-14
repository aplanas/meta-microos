SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktimer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "44c8a1194c2daad0059951eda91c5217fd06bb5fe2be726e5a5b16ff6a363feddd302a4a5b8dfb1e850803befcce806f2431c2c019b6e83371f5fba2b6169edc"

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
