SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwalletd5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "5d37b3f3b7ed2a6d938c5ba4d2397140f7974dfda69ebc6d0fa1dc1b50e37821a9457dca322990d89e45c66ee535985ea4d8d7261abc0af45d5e89b024cfdff4"

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
