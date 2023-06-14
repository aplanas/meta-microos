SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwallet-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5f6c552f1c9cee890f4e43c943ac3095778c68480db5ab37a807ea800d5f220be4f8037188722da1882c43b0b52169cdf4f3f323ec8d110a4fcb0c76db8ac8df"

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
