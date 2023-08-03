SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "3e73867ad660db124fd83cddae908dd7a627a04f216e6aca45cb692e97974d360b789944d5d7b3ad7f352c6c6cd005e0d56a2572df8576612181e636c2694c0e"

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
