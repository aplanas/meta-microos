SUMMARY = "Plugin for the SCRAM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 5802 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-scram-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "9ce4b9b821326c61bf07fd6b18d704d2caee66ab739ceab7c67e2010b34f9c389e98c943888d730994f1ba17278908a9dc2ca6f1054bd6d42aff74c9eeb7ecd9"

RPROVIDES:${PN} += "cyrus-sasl-bdb-scram \
cyrus-sasl-bdb-scram(aarch-64) \
libscram.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
