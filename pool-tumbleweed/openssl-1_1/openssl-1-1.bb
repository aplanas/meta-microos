SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-1.1.1u-4.1.aarch64.rpm"
RPM_HASH = "beaa2ce3abc0aa1dabcc709f180e6c7726542942c03800ee5bcd45479c1e90a71212bd08139c88e5045f3a16e7c5ce0dbd3d03fe2462f5820a673afc182c21cd"

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
