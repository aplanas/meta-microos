SUMMARY = "Cron job configuration tool"
DESCRIPTION = "KCron allows you to change your cron jobs setup."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcron-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f3dcd03dc51622eec51f97036285a18e1ac38cb3b7a0a79dcea0c11e7c1e54715be41c900834cb623cec76461e46045f4b22eb9c17a6adf32f3b74bd605f0f1d"

RPROVIDES:${PN} += "kcron \
kcron5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
