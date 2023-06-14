SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_and_profiler4-2.10-1.5.aarch64.rpm"
RPM_HASH = "e9339f4bf964b4f18608f44e55969b039442c2a73805ac9e4938da6e2183965908c73b832fe0ae6a60f7aaba6e70a9e2a320e232ca94dd46413875c3f140efbd"

RPROVIDES:${PN} += "libtcmalloc-and-profiler.so.4 \
libtcmalloc-and-profiler4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
