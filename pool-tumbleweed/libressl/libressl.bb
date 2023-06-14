SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL, with the aim of refactoring the OpenSSL code so as to \
provide a more secure implementation."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "7ed57c472485c483b89c7ffffcc16d3a2bc11013923ffdb1cd221082becfdcadea2bf1380451245a947fe37a857f4592662fbb981ea8876c424fab088ae8f47c"

RPROVIDES:${PN} += "config-libressl \
libressl \
openssl-cli \
ssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.50 \
libssl.so.53 \
libtls.so.26"

inherit rpm
