SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "e0b000c8fca686c8f68293bc8da40f9dbdde8603e8a6f6435bb57376e615fdb8af06d139578c207d4cc1fba910d84679023997e2044041d1a1d03b210bbeea1d"

RPROVIDES:${PN} += "libpmem.so.1()(64bit) \
libpmem.so.1(LIBPMEM_1.0)(64bit) \
libpmem1 \
libpmem1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit)"

inherit rpm
