SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "63549c33d504e567839add5c361a0c8f9964fe3343e0428fdc3981ba716d795a5f3d6d9fbb5fad468b834aa181b90a7ac9aafcb1f2a4e3feb306f909787a37f5"

RPROVIDES:${PN} += "config-openssl-1-0-0 \
openssl-1-0-0 \
openssl-cli \
ssl"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libssl.so.1.0.0"

inherit rpm
