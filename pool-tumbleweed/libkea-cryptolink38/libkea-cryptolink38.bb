SUMMARY = "Kea DHCP server crypto abstraction layer library"
DESCRIPTION = "The Kea cryptolink library is an abstraction layer for crypto \
library backends (such as Botan, OpenSSL)."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-cryptolink38-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "f8b6b47f0855626e5f437eaa05f046a05398f4f0e4fd4f8dee9bf5f4917a3bf6139fc3f231e3a51f46d53b89ac3a743bd9b3f6f535435793b0ffb8382f7da405"

RPROVIDES:${PN} += "libkea-cryptolink.so.38 \
libkea-cryptolink38"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.23 \
libstdc++.so.6"

inherit rpm
