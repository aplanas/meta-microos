SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl3-3.1.1-3.1.aarch64.rpm"
RPM_HASH = "fed5e739a32a7e5176097302ed7568a01ddd90d1d1caf2f937938d904a672f722585e83323ec049644ead898175a967dc7f02788f57281be59f46fd9a7240091"

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
