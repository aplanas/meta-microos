SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwallet-tools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "ce5061384db46681ea606cfc754383af87c021bd32b02d1dc9949c9d28fc2fc3c2e64ca0fc038bfbe51a67a22da83e6381a2223566fc5ca64a54e531a1f250fb"

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
