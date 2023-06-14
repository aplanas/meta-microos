SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "e0b000c8fca686c8f68293bc8da40f9dbdde8603e8a6f6435bb57376e615fdb8af06d139578c207d4cc1fba910d84679023997e2044041d1a1d03b210bbeea1d"

RPROVIDES:${PN} += "libpmem.so.1 \
libpmem1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6"

inherit rpm
