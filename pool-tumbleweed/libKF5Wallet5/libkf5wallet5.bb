SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Wallet5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "36890293ea66562ad3a0d5a31f4bdcde1589b1c3c17f24c39e0f0897185fecd75d8d9fbdc7452f6ad09bebcf6d3009f05235b4d31b273e3534bfb1111f55f494"

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
