SUMMARY = "Persistent Memory Resident Log File library"
DESCRIPTION = "The libpmemlog library provides a pmem-resident log file. This is \
useful for programs like databases that append frequently to a log \
file."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemlog1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "38b39e63c3a00376dc73472fdf2b084b5a359e5cc84105dc3b15f270658c5172b40a8ed429906231cc94cd865f835f6fae485a8bac1ed26decc1ec68b95fb8da"

RPROVIDES:${PN} += "libpmemlog.so.1()(64bit) \
libpmemlog.so.1(LIBPMEMLOG_1.0)(64bit) \
libpmemlog1 \
libpmemlog1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
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
libpmem.so.1(LIBPMEM_1.0)(64bit)"

inherit rpm
