SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "openssl-3-3.1.2-1.1.aarch64.rpm"
RPM_HASH = "901213f903d512061722536bac5a5b341c3a9ea4de37f1f9546a5c150ebc3b8d14f92bc2cbefec5235a7f360ae05bb5d65c15bb7f2bb3fc69003e3d5a3a91dfb"

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
