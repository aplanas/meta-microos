SUMMARY = "Development files for Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemlog, libpemblk and libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmempool-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "1b4749bfebd246d60c6c7671bfdf3c013610e8422063551003cb94aca7266bfdce36b3f39a1afb25aedfad08bb6dc716bfc946579993744547303a3f97b4f95e"

RPROVIDES:${PN} += "libpmempool-devel \
libpmempool-devel(aarch-64) \
pkgconfig(libpmempool)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit) \
libpmem.so.1()(64bit) \
libpmem.so.1(LIBPMEM_1.0)(64bit) \
libpmempool1 \
pkgconfig(libdaxctl) \
pkgconfig(libndctl) \
pkgconfig(libpmem)"

inherit rpm
