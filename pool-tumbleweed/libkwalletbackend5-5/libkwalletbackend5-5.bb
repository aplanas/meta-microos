SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libkwalletbackend5-5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "68f47d8a6054c09603ba85fbe2647e9af4c74a7e78baad46f2d66511ed403df35b7432440c497ea9012ac906888c313b64c4d4e1412b88eb02cb2e990c0f473e"

RPROVIDES:${PN} += "libkwalletbackend5-5 \
libkwalletbackend5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcrypt.so.20 \
libgpgmepp.so.6 \
libstdc++.so.6"

inherit rpm
