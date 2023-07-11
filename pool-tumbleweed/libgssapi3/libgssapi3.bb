SUMMARY = "GSSAPI implementation from Heimdal Kerberos"
DESCRIPTION = "GSSAPI implementation from Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libgssapi3-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "303062133cfa8f1d3e47a691de91c3702b0706cc118940625d21ee07c56f3c8c7fcb3c16732252e2b958254b8a63eb04d41347cb5a087279db390913b1a34ab5"

RPROVIDES:${PN} += "libgssapi.so.3 \
libgssapi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libhcrypto.so.4 \
libheimbase.so.1 \
libheimntlm.so.0 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
