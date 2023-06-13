SUMMARY = "Shared library for libtar"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive. \
 \
This package contains the shared library needed for libtar."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar1-1.2.20-2.16.aarch64.rpm"
RPM_HASH = "c32f814e0a600565388b3b8201d418e9141a5b9b5016cf3a0a5d48c2b5f42f3880fad96788074453c961534bf7bc23b3e7990f273475807850634b0f3fca8161"

RPROVIDES:${PN} += "libtar.so.1()(64bit) \
libtar1 \
libtar1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
