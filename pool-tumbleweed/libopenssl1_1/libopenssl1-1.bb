SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl1_1-1.1.1u-4.1.aarch64.rpm"
RPM_HASH = "7333e0adc8043ebd8379a9e572d77cd60b88ed3268ca608aeb763cbe9db282c80946240d46983acee644941117eb0916a30a33778faa570c5f4456936b4419f0"

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
