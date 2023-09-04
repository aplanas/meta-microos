SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutls30-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "409b7b1b3d19fde9262481bdd7db5beb4773272993072cb278969cfa7b58e5acaad31fcdc65d7fc79926ac691706846063210df3ac5358cf207430315cd9c7b7"

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
