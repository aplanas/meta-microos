SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-1-v-3-3-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "2eac359a44b6d32401beeb1a9d0dca3e15ddbaf6b1a4ba10249b2cb87ea48284944b467aea647b7dcd8d818284ac02d1d2a37d21b3c7560679c19e97f4c1e803"

RPROVIDES:${PN} += "libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-1-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile.so.17"

inherit rpm
