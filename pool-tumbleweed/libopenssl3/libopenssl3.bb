SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl3-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "f12d942e8bfb3a012cf322e4dbd954fb1d3e9a61d8d79fb2dacd1bb08989c5f01aab3a617ae8b7b0e87b2a0d10ad605197ed76e79706ec210b0bc32e1f5371c9"

RPROVIDES:${PN} += "libcrypto.so.3 \
libopenssl3 \
libopenssl3-hmac \
libssl.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
