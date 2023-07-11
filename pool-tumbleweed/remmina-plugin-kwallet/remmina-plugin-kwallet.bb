SUMMARY = "Remmina plugin to support the KDE Wallet"
DESCRIPTION = "KDE Wallet plugin, that can be used instead of the GNOME Keyring"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-kwallet-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "299ec2d1fd28702f37a52d058ef897e43cc003b6b77caace1bd5cddb39783ef76760cbbde32ee789ab91972e9e2849f3869080b82f9fa1a74d39ed0f88494260"

RPROVIDES:${PN} += "remmina-plugin-kwallet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
remmina"

inherit rpm
