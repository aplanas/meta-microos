SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile17-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "c8d051129097e9b35b44a6dea5d81a083a765f0a810a22f4e4d9afda52bf2c1a3c9e33f9314b867efd8b1e5924519173b44e5b8b3370b81156145c28a1758e1a"

RPROVIDES:${PN} += "libguile.so.17 \
libguile17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgmp.so.10 \
libltdl.so.7 \
libm.so.6"

inherit rpm
