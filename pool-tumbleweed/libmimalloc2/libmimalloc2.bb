SUMMARY = "A compact general purpose allocator"
DESCRIPTION = "This is a general purpose allocator. It is a drop-in replacement for \
malloc and can be used in other programs without code changes. \
 \
Performance characteristics in comparison to allocators like tcmalloc 2.7, \
jemalloc 5.2.1 and glibc 2.31 is favorable, with generally 6% or better in \
timing, depending on the particular workload."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "libmimalloc2-2.0.9-1.4.aarch64.rpm"
RPM_HASH = "a124c9365661077ca2c5f5c94d4930522a6db71f3084e4d8fd5d13fbaf052a47a65dd2aca3dbcbc4c6f7f745469a7dcab4d98d40275fccf1de11ec4c5973d6a0"

RPROVIDES:${PN} += "libmimalloc.so.2 \
libmimalloc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
