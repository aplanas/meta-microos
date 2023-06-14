SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile17-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "9589942d98760c97254af2e58004816aaf7b1271191c130eee3e24e66267d13988ac1cbf9d145f66ec935b7ceeeeedfa71d3e7932a454f6137799e74ff51a953"

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
