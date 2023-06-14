SUMMARY = "KDED module that manages the telepathy interactions with the KDE Desktop"
DESCRIPTION = "This module sits in KDED and takes care of various bits of system integration \
like setting user to auto-away or handling connection errors."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-kded-module-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "80f86464bfab58614312fa3f49aa7eeed6228fb3fe8d40eab965e6e8d1d673ce703c1d5041fb91e1231f6647dffad8e6742cee5cff941ae5b36049f6a1b18727"

RPROVIDES:${PN} += "ktp-kded-module \
ktp-kded-module5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKTpCommonInternals.so.9 \
libKTpWidgets.so.9 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
