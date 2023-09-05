SUMMARY = "Standard Shared Libraries (from the GNU C Library)"
DESCRIPTION = "The GNU C Library provides the most important standard libraries used \
by nearly all programs: the standard C library, the standard math \
library, and the POSIX thread library. A system is not functional \
without these libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.38"

RPM_NAME = "glibc-2.38-2.1.aarch64.rpm"
RPM_HASH = "cbcd8efecd334f420c25bd4c4b2cbe11da2b92d70754534c98da8b38d6aad1cb63eb82fbfc404da4273dcbba30f6e2e13ff40a252625bb8cf589b6681bbdf09a"

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
libmvec.so.1 \
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
