SUMMARY = "Plugin for the CRAMMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-crammd5-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "c47ea60627a2eedcd50fee0adeeda65b063c41c4dc84c7c87239a8c179cdc8147dd1895c6f692d4ff354d76d92a80720be81c2e18127b39ac3fff64d075d0908"

RPROVIDES:${PN} += "cyrus-sasl-crammd5 cyrus-sasl-crammd5(aarch-64) libcrammd5.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
