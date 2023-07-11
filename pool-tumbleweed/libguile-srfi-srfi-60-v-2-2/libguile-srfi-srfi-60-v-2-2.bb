SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-60-v-2-2-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "6129802ebb6c49bad4e898d0aaf6ec3b86ae77f8246caab2c5a9efc298ca1b42e9bc5e21276c5452a408c85b859d7ab01787a2fffb2b514ce410c4cc576b7fca"

RPROVIDES:${PN} += "libguile-srfi-srfi-60-v-2-2 \
libguile-srfi-srfi-60-v-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libguile.so.17"

inherit rpm
