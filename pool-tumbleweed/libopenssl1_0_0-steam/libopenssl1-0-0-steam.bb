SUMMARY = "Secure Sockets and Transport Layer Security for steam"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This subpackage is providing special patched edition for steam"
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-steam-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "e7d6abb29b5f1c1de561a92b93eef13b0159cc4a013e5d8aaa22da9c062890983939b2fc024ee7f8e14a92928d92251296e8578a2832bba9daec6d0a16b5d76e"

RPROVIDES:${PN} += "libopenssl1-0-0-steam"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libz.so.1"

inherit rpm
