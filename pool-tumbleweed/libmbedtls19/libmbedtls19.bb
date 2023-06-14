SUMMARY = "Transport Layer Security protocol suite"
DESCRIPTION = "mbedtls implements the SSL 3.0, TLS 1.0, 1.1 and 1.2 protocols. It \
supports a number of extensions such as SSL Session Tickets (RFC \
5077), Server Name Indication (SNI) (RFC 6066), Truncated HMAC (RFC \
6066), Max Fragment Length (RFC 6066), Secure Renegotiation (RFC \
5746) and Application Layer Protocol Negotiation (ALPN). It \
understands the RSA, (EC)DH(E)-RSA, (EC)DH(E)-PSK and RSA-PSK key \
exchanges."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "libmbedtls19-3.4.0-3.1.aarch64.rpm"
RPM_HASH = "eba5c675c60c96e8786c5538a4fe940744c74cdca7c0c122e54b2b9dd2bf3d94f5740fc67c242a4e98c10b9ed0a98d6c05765cd455c3cd76fcfb9e95f98044da"

RPROVIDES:${PN} += "libmbedtls.so.19 \
libmbedtls19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.14 \
libmbedx509.so.5"

inherit rpm
