SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "gnutls-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "ccbd23760633665316af4cb7c7f432a177994618a2035641158bfdbca658ca21edd029577521b998603df47abbd266c3b6385fce9dc3befa5ac9185ce011e8b0"

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
