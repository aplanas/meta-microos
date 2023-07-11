SUMMARY = "NTLM implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the NTLM support library from and for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimntlm0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "b8bbb1980fc59f3364ead377e9a92706a2608b3fe510d0954e5f536fd8510b89ae092352d90343a2c6d7364584bade8b2629aba6dec6ee9a1d80949485794290"

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
