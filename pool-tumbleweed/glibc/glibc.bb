SUMMARY = "Standard Shared Libraries (from the GNU C Library)"
DESCRIPTION = "The GNU C Library provides the most important standard libraries used \
by nearly all programs: the standard C library, the standard math \
library, and the POSIX thread library. A system is not functional \
without these libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-2.37-4.1.aarch64.rpm"
RPM_HASH = "e3ff1c6d2ff3c44e05b18897460a37eef53aac84dea4e936bca1650855ff1533fbbef34b32494efd25163da8b373dcbfa0090076b3a2fe1795f464871b13e165"

RPROVIDES:${PN} += "/sbin/ldconfig \
config(glibc) \
glibc \
glibc(aarch-64) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.34)(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.35)(64bit) \
ld-linux-aarch64.so.1(GLIBC_PRIVATE)(64bit) \
libBrokenLocale.so.1()(64bit) \
libBrokenLocale.so.1(GLIBC_2.17)(64bit) \
libanl.so.1()(64bit) \
libanl.so.1(GLIBC_2.17)(64bit) \
libc.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.18)(64bit) \
libc.so.6(GLIBC_2.22)(64bit) \
libc.so.6(GLIBC_2.23)(64bit) \
libc.so.6(GLIBC_2.24)(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libc.so.6(GLIBC_2.26)(64bit) \
libc.so.6(GLIBC_2.27)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libc.so.6(GLIBC_2.29)(64bit) \
libc.so.6(GLIBC_2.30)(64bit) \
libc.so.6(GLIBC_2.31)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libc.so.6(GLIBC_2.35)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libc.so.6(GLIBC_ABI_DT_RELR)(64bit) \
libc.so.6(GLIBC_PRIVATE)(64bit) \
libc_malloc_debug.so.0()(64bit) \
libc_malloc_debug.so.0(GLIBC_2.17)(64bit) \
libc_malloc_debug.so.0(GLIBC_2.33)(64bit) \
libdl.so.2()(64bit) \
libdl.so.2(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.18)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.24)(64bit) \
libm.so.6(GLIBC_2.25)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.28)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.31)(64bit) \
libm.so.6(GLIBC_2.32)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnsl.so.1()(64bit) \
libnsl.so.1(GLIBC_2.17)(64bit) \
libnsl.so.1(GLIBC_PRIVATE)(64bit) \
libnss_compat.so.2()(64bit) \
libnss_compat.so.2(GLIBC_PRIVATE)(64bit) \
libnss_db.so.2()(64bit) \
libnss_db.so.2(GLIBC_PRIVATE)(64bit) \
libnss_dns.so.2()(64bit) \
libnss_dns.so.2(GLIBC_PRIVATE)(64bit) \
libnss_files.so.2()(64bit) \
libnss_files.so.2(GLIBC_PRIVATE)(64bit) \
libnss_hesiod.so.2()(64bit) \
libnss_hesiod.so.2(GLIBC_PRIVATE)(64bit) \
libpthread.so.0()(64bit) \
libpthread.so.0(GLIBC_2.17)(64bit) \
libpthread.so.0(GLIBC_2.18)(64bit) \
libpthread.so.0(GLIBC_2.28)(64bit) \
libpthread.so.0(GLIBC_2.30)(64bit) \
libpthread.so.0(GLIBC_2.31)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit) \
libresolv.so.2(GLIBC_PRIVATE)(64bit) \
librt.so.1()(64bit) \
librt.so.1(GLIBC_2.17)(64bit) \
libthread_db.so.1()(64bit) \
libthread_db.so.1(GLIBC_2.17)(64bit) \
libutil.so.1()(64bit) \
libutil.so.1(GLIBC_2.17)(64bit) \
ngpt \
ngpt-devel \
rtld(GNU_HASH)"
RDEPENDS:${PN} += "filesystem"

inherit rpm
