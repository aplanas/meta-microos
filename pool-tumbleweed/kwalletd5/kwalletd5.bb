SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwalletd5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "44c143149d97e3cb7924ec09a38bcdd4a461581e75f9441ea68d58f80837397eeb9dd03c605c4ef93a4ce826aaf361918d64fbcc22b93c6dedce0dc5bbd0bc14"

RPROVIDES:${PN} += "kwalletd5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libkwalletbackend5.so.5 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
