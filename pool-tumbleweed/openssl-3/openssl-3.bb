SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "9fc41eb47b8b60bc440e1d8502f16379579be51c86cd799d3c02be7087357e8580f7e0d7a6a0f38dae309cf315a44a341c2993a0903c47018dfe86b40a1b14b2"

RPROVIDES:${PN} += "config-openssl-3 \
openssl-3 \
ssl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libopenssl3 \
libssl.so.3 \
openssl"

inherit rpm
