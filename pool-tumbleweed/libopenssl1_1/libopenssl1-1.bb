SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl1_1-1.1.1u-1.1.aarch64.rpm"
RPM_HASH = "31753dd1715e1e27a0eedaa1fe262b6d9a65c47957539b7ee8f62e996fddc66a825d746b42de079c37ff588e687b0214a499fa46ec42ade0bb265abcbd00d6b1"

RPROVIDES:${PN} += "libcrypto.so.1.1 \
libopenssl1-1 \
libopenssl1-1-hmac \
libssl.so.1.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
