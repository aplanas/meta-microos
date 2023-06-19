SUMMARY = "Standard Shared Libraries (from the GNU C Library)"
DESCRIPTION = "The GNU C Library provides the most important standard libraries used \
by nearly all programs: the standard C library, the standard math \
library, and the POSIX thread library. A system is not functional \
without these libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-2.37-4.1.aarch64.rpm"
RPM_HASH = "e3ff1c6d2ff3c44e05b18897460a37eef53aac84dea4e936bca1650855ff1533fbbef34b32494efd25163da8b373dcbfa0090076b3a2fe1795f464871b13e165"

RPROVIDES:${PN} += "/sbin/ldconfig \
config-glibc \
glibc \
ld-linux-aarch64.so.1 \
libBrokenLocale.so.1 \
libanl.so.1 \
libc-malloc-debug.so.0 \
libc.so.6 \
libdl.so.2 \
libm.so.6 \
libnsl.so.1 \
libnss-compat.so.2 \
libnss-db.so.2 \
libnss-dns.so.2 \
libnss-files.so.2 \
libnss-hesiod.so.2 \
libpthread.so.0 \
libresolv.so.2 \
librt.so.1 \
libthread-db.so.1 \
libutil.so.1 \
ngpt \
ngpt-devel \
rtld-GNU-HASH"

RDEPENDS:${PN} += "filesystem"

inherit rpm
