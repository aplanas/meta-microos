SUMMARY = "Telepathy auth handler"
DESCRIPTION = "Telepathy-auth-handler provides UI/KWallet integration for passwords and \
SSL errors on account connect."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-auth-handler-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "364a4fa675f4054228338ffe26d8521efd00399ef506bebaf7b111e75e501f8a4d0db6ea5689bed270be965d0ee029f4068b18a2dc86bd4e50fadb38d1273367"

RPROVIDES:${PN} += "ktp-auth-handler \
ktp-auth-handler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKTpCommonInternals.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libkaccounts.so.2 \
libqca-qt5-plugins \
libqca-qt5.so.2 \
libsignon-qt5.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0 \
signon-plugin-oauth2"

inherit rpm
