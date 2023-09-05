SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktimer-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7c9b7bc1c25171f2c609b6cfcbd210197c2471473fb7682eb5da275a6a471b270c6bee3bcc6947808afd7b730da6f868d183ea839140713f925df52e8400dfd7"

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
