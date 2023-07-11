SUMMARY = "Belgium electronic identity card PKCS#11 module - libraries"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the actual libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.11"

RPM_NAME = "eid-mw-libs-5.1.11-1.1.aarch64.rpm"
RPM_HASH = "41e2ab59c3d636c5058a1f17549e425e32098d5e4c2acc34a24bd4cc4a10556e9c4bc4207e996d6002d838bba1cd8a9c3c26d0708ac0e666c47eb14e1740dd00"

RPROVIDES:${PN} += "eid-mw-libs \
libbeidpkcs11.so.0 \
libeidviewer.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpcsclite.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
