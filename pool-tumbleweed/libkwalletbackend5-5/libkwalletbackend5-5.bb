SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libkwalletbackend5-5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1d5e1a4dce57f9ecd319d77b3d6acede0756c30c31d9d4181570dca20f85758fb40aab5ab2328e631cc27a11a7037b6eff8dd8d32008cd6a8b65da48d6cb12d8"

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
