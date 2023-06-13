SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL and intends to provide a more secure implementation."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libssl53-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "dbe16e3b500a18465f90cee7482ca8defebc712b56a52714521da6db9da962da6b50de23960c24baa5503d17f8cc02f20496a3869514c4a9a90108f989a295bf"

RPROVIDES:${PN} += "libssl.so.53()(64bit) \
libssl.so.53(LIBRESSL)(64bit) \
libssl53 \
libssl53(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.50()(64bit) \
libcrypto.so.50(LIBRESSL)(64bit)"

inherit rpm
