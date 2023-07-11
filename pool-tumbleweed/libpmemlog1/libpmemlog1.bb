SUMMARY = "Persistent Memory Resident Log File library"
DESCRIPTION = "The libpmemlog library provides a pmem-resident log file. This is \
useful for programs like databases that append frequently to a log \
file."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemlog1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "ffc266047105cbf29f3dea32d1dc2f7c3ac9a8b89ab8e98a268f084e2f88f675b722a30fd171b410c4323036444daa0db5ab359fbcec4d32b9393ffe25ca2514"

RPROVIDES:${PN} += "libpmemlog.so.1 \
libpmemlog1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
