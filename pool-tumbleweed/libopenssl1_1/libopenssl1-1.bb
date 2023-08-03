SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl1_1-1.1.1u-5.1.aarch64.rpm"
RPM_HASH = "40d0d304776fbd65286a642c72143129b2292a65b5e9cc51a0c5ce1b057dc89c355680188aa9691608288499dd51723507a77a7564b1ebeeea60af3456f08a32"

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
