SUMMARY = "KWallet integration for signon framework"
DESCRIPTION = "KWallet integration for signon framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "signon-kwallet-extension-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a5bb36c4d4ffab9709a13f43eafa080843719c538b1223d819c3794638f4b6598669c83206cd8b8e2a2cd7269a66aafa44d78d384575b43ebf608aa7e71736d9"

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
