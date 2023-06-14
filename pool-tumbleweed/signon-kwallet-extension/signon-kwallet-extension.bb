SUMMARY = "KWallet integration for signon framework"
DESCRIPTION = "KWallet integration for signon framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "signon-kwallet-extension-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3873ce65c413fad94d3bf590f10940f6fb82a488a1d8291afcf69dec756f023f53fe995094054dde976ace8f913c37c45952d03d252a06dd05865d55e46f3239"

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
