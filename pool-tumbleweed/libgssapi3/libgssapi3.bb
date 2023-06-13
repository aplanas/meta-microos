SUMMARY = "GSSAPI implementation from Heimdal Kerberos"
DESCRIPTION = "GSSAPI implementation from Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libgssapi3-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "88d181095da42e08cc39d7538fd5be58fde9a72b6829532fa9831d2df94cdfc402044aff2e13321431dcdd823e9b345db2bc23929d927daee0443808dcd9e119"

RPROVIDES:${PN} += "libgssapi.so.3()(64bit) \
libgssapi.so.3(HEIMDAL_GSS_2.0)(64bit) \
libgssapi3 \
libgssapi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libhcrypto.so.4()(64bit) \
libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit) \
libheimbase.so.1()(64bit) \
libheimbase.so.1(HEIMDAL_BASE_1.0)(64bit) \
libheimntlm.so.0()(64bit) \
libheimntlm.so.0(HEIMDAL_NTLM_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit)"

inherit rpm
