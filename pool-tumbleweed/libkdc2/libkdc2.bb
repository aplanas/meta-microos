SUMMARY = "Key Distribution Center library for Heimdal Kerberos"
DESCRIPTION = "This package contains the KDC support library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkdc2-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "b6d844d35142bc0e47f3d99fe1fa729f2aa17bfccf7e73c9cfd628bf227a03ca8c7c8879b451f1ff1efef1143694abb02799671a230b1922c14c56e218ed8b45"

RPROVIDES:${PN} += "libkdc.so.2 \
libkdc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libhcrypto.so.4 \
libhdb.so.9 \
libheimbase.so.1 \
libheimntlm.so.0 \
libhx509.so.5 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
