SUMMARY = "Cron job configuration tool"
DESCRIPTION = "KCron allows you to change your cron jobs setup."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kcron-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d4f31866b56e74ffe4203586cab1afb5f25066963e78fa2684e870d4789778e48ed265b85320a14b91dbab3d9eea1a5b8d1cc481a11062db7fa3b4b78bc283e5"

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
