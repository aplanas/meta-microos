SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "6b124af586613e0d4c430f877a28cda2fa8ffc1b0053240549f2949b886de554c9a01118d836dae1704b25036ea8e7416cc4f69bf07b46a4b95848fba6fbe9af"

RPROVIDES:${PN} += "libcrypto.so.1.0.0 \
libgost.so \
libopenssl1-0-0 \
libopenssl1-0-0-hmac \
libssl.so.1.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
