SUMMARY = "Kea DHCP server crypto abstraction layer library"
DESCRIPTION = "The Kea cryptolink library is an abstraction layer for crypto \
library backends (such as Botan, OpenSSL)."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cryptolink28-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "81aabbd714889e1e04017cff5a0162bc08e2d56aff3fc60e4b3a035eb2372eaa99b0e5bd3c4b2b3cecbd4d41c71cc6857510f1fc16e0990cfe4808eb69285f34"

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
