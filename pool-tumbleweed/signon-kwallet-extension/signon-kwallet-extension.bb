SUMMARY = "KWallet integration for signon framework"
DESCRIPTION = "KWallet integration for signon framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "signon-kwallet-extension-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2c689b1b1a69007a59b5e24440bef9eeed5d94b957de74bbdc99fd8a5e49259d2cdf6370b393c91fbd1f9c83028f15ad86f34150a3d7668c6d7eab2cb575c96a"

RPROVIDES:${PN} += "libkeyring-kwallet.so \
signon-kwallet-extension"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsignon-extension.so.1 \
libstdc++.so.6"

inherit rpm
