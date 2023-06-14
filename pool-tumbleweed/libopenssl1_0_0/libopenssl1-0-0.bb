SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "2c13af15336c68a55e4c5e2395d3c273184e74845aa2995d5a60f7d4a18abc473465465f9bb6288a3536654f98fe7cec42c229e8eb24acb846c10006827b04f0"

RPROVIDES:${PN} += "libcrypto.so.1.0.0 \
libgost.so \
libopenssl1-0-0 \
libssl.so.1.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
