SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "f85438319df6aefeae4a99213bf859a4d44dfd97415f2c5f7512d70cd1071f66453f54eba180e2207cb9053f987c7c30bec229b7cf436f67f7266e0c2c62c2e0"

RPROVIDES:${PN} += "config-openssl-1-0-0 \
openssl-1-0-0 \
openssl-cli \
ssl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libssl.so.1.0.0"

inherit rpm
