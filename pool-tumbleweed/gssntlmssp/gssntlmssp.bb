SUMMARY = "GSSAPI NTLMSSP Mechanism"
DESCRIPTION = "A GSSAPI Mechanism that implements NTLMSSP."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "gssntlmssp-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "8a14239e65f00ae40d12e6454db82d02fd04df93003d436bce2d09e4032ad35baca9929c577f3ef7d920ef8b3033b626e84a8c5da6f769b03aa1534d1505744f"

RPROVIDES:${PN} += "config(gssntlmssp) \
gssntlmssp \
gssntlmssp(aarch-64)"

RDEPENDS:${PN} += "krb5 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libunistring.so.5()(64bit) \
libwbclient.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
