SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls30-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "ad8c274d99bc251d6ff6000ec2ba4fecdfe6eaeebcc276b61f9ac658929242f07d070b320bb97c4229a84f02fe1063cbdc000e39cfa0b1dc14c4d85eb6b845f5"

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
