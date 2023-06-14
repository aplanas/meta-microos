SUMMARY = "Secure Sockets and Transport Layer Security for steam"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This subpackage is providing special patched edition for steam"
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-steam-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "2ae69d6082426980ce374d3cbbf3612d6d4b14b2d62722bbd9ea44e7792d90cf176f44610ca623f756ab6cdb9dd3a49724a4f6dbbfcfa811d98b60d6ef224177"

RPROVIDES:${PN} += "libopenssl1-0-0-steam"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libz.so.1"

inherit rpm
