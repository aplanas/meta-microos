SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-1.1.1u-5.1.aarch64.rpm"
RPM_HASH = "52424051a581c6519d4c7f5f0128c445e64aa7ae2275ad3861e80294f28cb519314b5c17a1e2d41f1b20a911781361f22d31b96d326aa9803d6d694fb48185af"

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
