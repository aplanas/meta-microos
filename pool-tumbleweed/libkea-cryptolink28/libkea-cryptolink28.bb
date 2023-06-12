SUMMARY = "Kea DHCP server crypto abstraction layer library"
DESCRIPTION = "The Kea cryptolink library is an abstraction layer for crypto \
library backends (such as Botan, OpenSSL)."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cryptolink28-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "ae37e01255ba6fcc03993fa86557fc6fd8a6e4df124619d5a88888ee1f12433b13da6afaa3ff07d29e2786c3f9fec5b24406299c8e60b2c6ee8a4064efcebc66"

RPROVIDES:${PN} += "libkea-cryptolink.so.28()(64bit) \
libkea-cryptolink28 \
libkea-cryptolink28(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-exceptions.so.13()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
