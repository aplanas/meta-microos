SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwallet-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6871587c2dab2aa83850ef26941901d7aece917851762cfd2e1c7ab15abc366cb2558ef25bc445dae3ac1f6ead8a8764ad6d77ccc7ecb7da774ee892c07a99b5"

RPROVIDES:${PN} += "kwallet-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
