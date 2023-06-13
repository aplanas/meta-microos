SUMMARY = "Telepathy auth handler"
DESCRIPTION = "Telepathy-auth-handler provides UI/KWallet integration for passwords and \
SSL errors on account connect."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-auth-handler-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0aa767f4d77ce432e21d9531cb0378e7fa58692adc81564ef07180b7e13f0aad3ab4da9aa96b89d4ae7ecc63f5d8dd07910d4c8df34835151cbd924be3e4d6fb"

RPROVIDES:${PN} += "ktp-auth-handler \
ktp-auth-handler(aarch-64) \
ktp-auth-handler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKTpCommonInternals.so.9()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libaccounts-qt5.so.1()(64bit) \
libc.so.6()(64bit) \
libkaccounts.so.2()(64bit) \
libqca-qt5-plugins \
libqca-qt5.so.2()(64bit) \
libsignon-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit) \
signon-plugin-oauth2"

inherit rpm
