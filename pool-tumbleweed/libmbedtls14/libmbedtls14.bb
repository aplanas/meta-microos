SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0"

PV = "2.28.3"

RPM_NAME = "libmbedtls14-2.28.3-2.1.aarch64.rpm"
RPM_HASH = "f98d0be375b640b8f066f12cbb5e75045068683e7d2622390af846c96e0dd1bb4db8a93b5dff676ad3c16ca2f291481dfd82cbc9f4ece5820ab446bd1961e920"

RPROVIDES:${PN} += "libmbedtls.so.14 \
libmbedtls14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.7 \
libmbedx509.so.1 \
libz.so.1"

inherit rpm
