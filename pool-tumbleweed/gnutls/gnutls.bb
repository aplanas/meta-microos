SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "gnutls-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "d81c8fa09f408885a368a0a0986958d66348f44eea1cecb2a913908c24b3cb5cca89187b33d86fb36682031f7122828df9082b8b2128e59e58c3c927ab7a6789"

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
