SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwallet-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "34886d77768ce636fa0777268396a2af6294893b0019da10d267868044085f7723cca0020e2ee75d868517e9c79e2d8a2647b04ae92e652bb832dca8358d7a23"

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
