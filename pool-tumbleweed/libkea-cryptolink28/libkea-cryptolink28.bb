SUMMARY = "Kea DHCP server crypto abstraction layer library"
DESCRIPTION = "The Kea cryptolink library is an abstraction layer for crypto \
library backends (such as Botan, OpenSSL)."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cryptolink28-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "ae37e01255ba6fcc03993fa86557fc6fd8a6e4df124619d5a88888ee1f12433b13da6afaa3ff07d29e2786c3f9fec5b24406299c8e60b2c6ee8a4064efcebc66"

RPROVIDES:${PN} += "libkea-cryptolink.so.28 \
libkea-cryptolink28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libstdc++.so.6"

inherit rpm
