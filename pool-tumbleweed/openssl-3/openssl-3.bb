SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-3.1.1-3.1.aarch64.rpm"
RPM_HASH = "7671188d5c8b1ab25b56022bfa0956a8b78c1771bea618221319c08bf746af1d2da2ada831a03d7576bbffd593fa8443655a2840d3134de4802c541d6e713fb7"

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
