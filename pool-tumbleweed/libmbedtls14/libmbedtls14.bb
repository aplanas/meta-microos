SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0"

PV = "2.28.4"

RPM_NAME = "libmbedtls14-2.28.4-1.1.aarch64.rpm"
RPM_HASH = "31fc9670fad6dbdb2ddfcd2f367190c6bd98a1aba10e5e4e0fd6ccf5d8b922656e83a1e06c071d56468b5a40f1a19ff9d0570304f0c05726d54bf4c5116ad86f"

RPROVIDES:${PN} += "libmbedtls.so.14 \
libmbedtls14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.7 \
libmbedx509.so.1 \
libz.so.1"

inherit rpm
