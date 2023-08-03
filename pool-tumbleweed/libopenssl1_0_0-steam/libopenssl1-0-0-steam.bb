SUMMARY = "Secure Sockets and Transport Layer Security for steam"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This subpackage is providing special patched edition for steam"
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-steam-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "1c48c992ebf23546c63c397ec7c29a180e90327e4cdc2ba261a07c2b7a352d8e8a4ce5da0c5d8584412add956c8832c7dca21e400333e2641534b3f392d69dde"

RPROVIDES:${PN} += "libopenssl1-0-0-steam"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libz.so.1"

inherit rpm
