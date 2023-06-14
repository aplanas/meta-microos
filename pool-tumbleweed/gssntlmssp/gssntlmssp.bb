SUMMARY = "GSSAPI NTLMSSP Mechanism"
DESCRIPTION = "A GSSAPI Mechanism that implements NTLMSSP."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "gssntlmssp-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "8a14239e65f00ae40d12e6454db82d02fd04df93003d436bce2d09e4032ad35baca9929c577f3ef7d920ef8b3033b626e84a8c5da6f769b03aa1534d1505744f"

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
