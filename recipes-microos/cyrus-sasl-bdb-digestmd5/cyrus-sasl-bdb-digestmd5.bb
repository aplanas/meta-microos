SUMMARY = "Plugin for the DIGESTMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-digestmd5-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "13fcdedf59da3b3b7f84dafbb62fcbc8f1235e7c18a981db89177ba10d78f9422a90ebe07840f6435f05d5595b036dc4360a0f18d574a0877caedbf870911f8a"

RPROVIDES:${PN} += "cyrus-sasl-bdb-digestmd5 cyrus-sasl-bdb-digestmd5(aarch-64) libdigestmd5.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl-bdb ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
