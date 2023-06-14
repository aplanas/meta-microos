SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls30-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "0a5be643d8eda09bfb2b9413aa2fe285a5e35b39b3fa296403146194b1c37a1e9cea441940621ed1c940f2b182677890738257b2771917cb3fac7ae0efbf289d"

RPROVIDES:${PN} += "libgnutls.so.30 \
libgnutls30 \
libgnutls30-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libhogweed.so.6 \
libidn2.so.0 \
libjitterentropy.so.3 \
libnettle.so.8 \
libp11-kit.so.0 \
libtasn1.so.6 \
libunistring.so.5 \
libz.so.1"

inherit rpm
