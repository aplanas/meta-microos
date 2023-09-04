SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "libopenssl3-3.1.2-1.1.aarch64.rpm"
RPM_HASH = "84ebc47d4610122c3a36ade51d9bff6bc8593484e7f560f333b8a655ab44ba928458a07991524ddff17dae9a68a2794b8232c4e7369c9b148af28959678237e1"

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
