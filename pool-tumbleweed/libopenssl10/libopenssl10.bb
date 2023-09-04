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

RPM_NAME = "libopenssl10-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "7db8bd39713326a9e6459a8ffb31c1e75a9209ee3f804e1baf3aa62fa659c18005579eec7d0ad90c104cc6070fb681e690d9741563f5a38eb3477058481932a2"

RPROVIDES:${PN} += "libcrypto.so.10 \
libopenssl10 \
libssl.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
