SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "gnutls-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "33619542a58b3490767eb52587f797d4b33535d712870d89d5869d4c6ccb3c49972a4cfe75ead88820e0f5845d3ca1fcbdc99eff4f35bacce5275e10d88d1631"

RPROVIDES:${PN} += "gnutls"

RDEPENDS:${PN} += "crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls-dane.so.0 \
libgnutls-dane0 \
libgnutls.so.30 \
libjitterentropy3 \
libm.so.6 \
libtasn1.so.6"

inherit rpm
