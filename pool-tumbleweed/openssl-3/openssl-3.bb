SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "99d999696ed85980fb1ee1fed0f6c16aaafa1aec0cd568b32ccd3e7745ae32410474cab16116686f7a0cc12b654398b7b024a29fe8aa70a1d6d5501b8f0e5c46"

RPROVIDES:${PN} += "config(openssl-3) \
openssl(cli) \
openssl-3 \
openssl-3(aarch-64) \
ssl"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env \
crypto-policies \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcrypto.so.3(OPENSSL_3.0.3)(64bit) \
libcrypto.so.3(OPENSSL_3.0.9)(64bit) \
libopenssl3 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
openssl"

inherit rpm
