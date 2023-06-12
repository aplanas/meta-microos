SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL, with the aim of refactoring the OpenSSL code so as to \
provide a more secure implementation."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "7ed57c472485c483b89c7ffffcc16d3a2bc11013923ffdb1cd221082becfdcadea2bf1380451245a947fe37a857f4592662fbb981ea8876c424fab088ae8f47c"

RPROVIDES:${PN} += "config(libressl) \
libressl \
libressl(aarch-64) \
openssl(cli) \
ssl"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.50()(64bit) \
libcrypto.so.50(LIBRESSL)(64bit) \
libssl.so.53()(64bit) \
libssl.so.53(LIBRESSL)(64bit) \
libtls.so.26()(64bit) \
libtls.so.26(LIBRESSL)(64bit)"

inherit rpm
