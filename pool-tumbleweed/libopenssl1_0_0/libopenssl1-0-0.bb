SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "92410a65b74f360fd4177a86e243aefb6046f83af56cd9b0bbc4bd60b8d0373a52d1e1bb7d9e584e68b11c981f29cfbbd5d785fa35fe4533b0c4c104ed17d2ef"

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
