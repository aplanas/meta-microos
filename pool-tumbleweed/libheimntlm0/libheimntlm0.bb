SUMMARY = "NTLM implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the NTLM support library from and for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimntlm0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "582641e1eb7c899ddc74a2ad530b75d654deb53c95d02cd9a25ac131e1374ae186b0297451f4a5f7c5bc53cd509093e9e8f0eeadbd7a7114fdc9e3a3465f389e"

RPROVIDES:${PN} += "libheimntlm.so.0 \
libheimntlm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libhcrypto.so.4 \
libkrb5.so.26 \
libroken.so.18 \
libwind.so.0"

inherit rpm
