SUMMARY = "NTLM implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the NTLM support library from and for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimntlm0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "582641e1eb7c899ddc74a2ad530b75d654deb53c95d02cd9a25ac131e1374ae186b0297451f4a5f7c5bc53cd509093e9e8f0eeadbd7a7114fdc9e3a3465f389e"

RPROVIDES:${PN} += "libheimntlm.so.0()(64bit) \
libheimntlm.so.0(HEIMDAL_NTLM_1.0)(64bit) \
libheimntlm0 \
libheimntlm0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcom_err.so.2()(64bit) \
libhcrypto.so.4()(64bit) \
libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit) \
libwind.so.0()(64bit) \
libwind.so.0(HEIMDAL_WIND_1.0)(64bit)"

inherit rpm
