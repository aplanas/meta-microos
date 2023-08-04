SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1v"

RPM_NAME = "openssl-1_1-1.1.1v-1.1.aarch64.rpm"
RPM_HASH = "858770239d8aa4016148e3fbdeb3d38455abc4d0fd7e091ae9ad57939e9df9a2c4fa82d959094beb038352e4b94a49cc917b595309c2edb22c14111ef382f730"

RPROVIDES:${PN} += "config-openssl-1-1 \
openssl-1-1 \
ssl"

RDEPENDS:${PN} += "/usr/bin/env \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1 \
libopenssl1-1 \
libssl.so.1.1"

inherit rpm
