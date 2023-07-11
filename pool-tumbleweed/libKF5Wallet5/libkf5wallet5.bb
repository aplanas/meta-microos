SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Wallet5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "da5f191bf07791bf1b1abd134baae4ecf3e81bbf698ded4bdc18445c4d4bcde3b11a34e7de5ff941b5a82c2ae61a7f1090c390bb4cffcf7efa86330a6ab08546"

RPROVIDES:${PN} += "libKF5Wallet.so.5 \
libKF5Wallet5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
