SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "94ab567fdbf5dd39d50fd2b7956a47039163100607c7538a97b12c2600048f73f7aa7c08a2793abf0a9bf18eb84591f7d7fd01c2d7e2a0bbb949375c2dc420e7"

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
