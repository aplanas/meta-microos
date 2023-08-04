SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1v"

RPM_NAME = "libopenssl1_1-1.1.1v-1.1.aarch64.rpm"
RPM_HASH = "28421421d7bde326f732240a59efd2bb43035613b337cd172785835888699cbc7adde8fb7384204485be1a1f7b4d4d5d3d98e1d774441a8d78ad104d78da1fe2"

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
