SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Wallet5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1aad3c21876c97daa910cbb7a0d33a7de153f9f60f2869effe636d98404020c761cdb6d5b7f221e511962e00e1a42134fbd1eb0e64477aa8b58ba29e347be38e"

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
