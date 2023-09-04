SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "4d2f5180beb1c7fa987ad31e413e6ee6dbfe63a9ae4325d8bc07eed6c5588f2e9ee7fe491c6d76b74f63b4d4ab124f5d991cbb61ac7f00462ac45e898b4b921f"

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
