SUMMARY = "A simplified interface for the OpenSSL/LibreSSL TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL and intends to provide a more secure implementation. \
 \
The libtls library provides a modern and simplified interface (of \
libssl) for secure client and server communications."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libtls26-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "07634a2be105cefbce2a8219d5ef42cb557dfe73886e761f93fec3500c20c333e9325efdbfb249a17a6d3b6b82456f0e40bd8fccf077bf07f5c3d1811fb5dfc2"

RPROVIDES:${PN} += "libtls.so.26 \
libtls26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
