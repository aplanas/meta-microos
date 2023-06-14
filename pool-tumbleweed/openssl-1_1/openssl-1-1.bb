SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-1.1.1u-1.1.aarch64.rpm"
RPM_HASH = "eae2b6db50c364286a93958e862dfd3000dc396e672dd9b97671b8e0064b124d80fc5181d5d588106c7b33f741622ade489d732f2cc4af2468dabca7341befeb"

RPROVIDES:${PN} += "config-openssl-1-1 \
openssl-1-1"

RDEPENDS:${PN} += "/usr/bin/env \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1 \
libopenssl1-1 \
libssl.so.1.1"

inherit rpm
