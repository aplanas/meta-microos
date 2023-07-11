SUMMARY = "Cron job configuration tool"
DESCRIPTION = "KCron allows you to change your cron jobs setup."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kcron-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "0863a9c7e7677eaee26fbf27b635e5ed2e50b7860ce4d1c9fdfba2b2f03a71cc3802f056702ccb68ac16bde9fccc6f5b5115b6465792c27fd9d303fa24c66bb7"

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
