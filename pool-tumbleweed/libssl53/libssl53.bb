SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL and intends to provide a more secure implementation."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libssl53-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "50170d4c4acda09554478991b06afc78bcb5fd985a2efba7866a2bed245a366fac8cb7ad0e5e6fe2b5893db723b5e63a2e8de23a20caa438a84fdf893db9fedf"

RPROVIDES:${PN} += "libssl.so.53 \
libssl53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.50"

inherit rpm
