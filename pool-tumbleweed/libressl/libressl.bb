SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL, with the aim of refactoring the OpenSSL code so as to \
provide a more secure implementation."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "4fd86521f94fddff8825551ed782dfd5eed34c3911a00ba1524591bff73496f7430d6494c6b4b687b715b6add56e0cf77a42694ee282cb6753c6ef8306ef0bf0"

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
