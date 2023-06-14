SUMMARY = "A simplified interface for the OpenSSL/LibreSSL TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL and intends to provide a more secure implementation. \
 \
The libtls library provides a modern and simplified interface (of \
libssl) for secure client and server communications."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libtls26-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "7f0960b2f937e699e27c60a40387837089fbeb366f1f020741e648653753e16ad26eda2a4da604547965eae879562c1de371a08cbe396c3447197ca8f426afe6"

RPROVIDES:${PN} += "libtls.so.26 \
libtls26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
