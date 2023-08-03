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

RPM_NAME = "libopenssl10-1.0.2u-21.1.aarch64.rpm"
RPM_HASH = "2c3cec055f22c4813f78862d6207287897d6bc4e5a8265a3e4aebb675c3c97e8ac376e732b48ca371c8066fe41233159bf0bf2c446d4769ebdf9bb17886ed50c"

RPROVIDES:${PN} += "libcrypto.so.10 \
libopenssl10 \
libssl.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
