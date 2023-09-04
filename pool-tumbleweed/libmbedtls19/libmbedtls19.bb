SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libmbedtls19-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "92e4200fc96672de7645390e005c129656dc3f54c2a3f24945f479f4ee3302eea17b1f942deb378130784d8455491aa0b0a706c4665ae136ebec10993b1bfcf2"

RPROVIDES:${PN} += "libmbedtls.so.19 \
libmbedtls19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.14 \
libmbedx509.so.5"

inherit rpm
