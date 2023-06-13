SUMMARY = "Development files for the Persistent Memory Resident Log File library"
DESCRIPTION = "The libpmemlog library provides a pmem-resident log file. This \
library is provided for cases requiring an append-mostly file to \
record variable length entries. Most developers will find higher \
level libraries like libpmemobj to be more generally useful."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemlog-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "46bab18b980269c29c736cb29f0ec6b61c44a8876cc26d8d64f03e5d1f42d06e5ebd0eb517906c4775292617d7407fb2a1f447c7097e321ab7ee5456dc20ab39"

RPROVIDES:${PN} += "libpmemlog-devel \
libpmemlog-devel(aarch-64) \
pkgconfig(libpmemlog)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit) \
libpmem.so.1()(64bit) \
libpmemlog1 \
pkgconfig(libdaxctl) \
pkgconfig(libndctl) \
pkgconfig(libpmem)"

inherit rpm
