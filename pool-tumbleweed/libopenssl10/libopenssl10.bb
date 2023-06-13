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

RPM_NAME = "libopenssl10-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "ef878425799d3d33cb068d67378cec56376157fe9745294f4bd0d0c2cf03de2f1fed2f2e387964ff81add57c4b6521c907b7d832438faf1ac71289845aac26b6"

RPROVIDES:${PN} += "libcrypto.so.10()(64bit) \
libcrypto.so.10(OPENSSL_1.0.0)(64bit) \
libcrypto.so.10(OPENSSL_1.0.1)(64bit) \
libcrypto.so.10(OPENSSL_1.0.1_EC)(64bit) \
libcrypto.so.10(OPENSSL_1.0.2)(64bit) \
libcrypto.so.10(libcrypto.so.10)(64bit) \
libopenssl10 \
libopenssl10(aarch-64) \
libssl.so.10()(64bit) \
libssl.so.10(OPENSSL_1.0.0)(64bit) \
libssl.so.10(OPENSSL_1.0.1)(64bit) \
libssl.so.10(OPENSSL_1.0.1_EC)(64bit) \
libssl.so.10(OPENSSL_1.0.2)(64bit) \
libssl.so.10(libssl.so.10)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
