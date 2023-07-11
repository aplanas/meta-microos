SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This package contains libcrypto.so.10 and libssl.so.10 symlinks and \
provided capabilities usually provided by other distributions for \
compatibility with third party packages."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl10-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "7ad5dd4398b70c5085e1b24408e9c20e3bfe3d51299b2318b5ab872a0032e18fc203e56821aa9b6fddaabb126c7dcf235548531311ade802d8bed8de9ea10240"

RPROVIDES:${PN} += "libcrypto.so.10 \
libopenssl10 \
libssl.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
