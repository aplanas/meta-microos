SUMMARY = "GSSAPI NTLMSSP Mechanism"
DESCRIPTION = "A GSSAPI Mechanism that implements NTLMSSP."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "gssntlmssp-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "d697d1eb97cc7bd451b320be2da9d4f73b976e35fabed4aa5d22f09ca19985d575e64db9f68ce2684d65ed0db7c3ed39e60ead9f19b08427b00b615540800a2d"

RPROVIDES:${PN} += "config-gssntlmssp \
gssntlmssp"

RDEPENDS:${PN} += "krb5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libunistring.so.5 \
libwbclient.so.0 \
libz.so.1"

inherit rpm
