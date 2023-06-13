SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_and_profiler4-2.10-1.5.aarch64.rpm"
RPM_HASH = "e9339f4bf964b4f18608f44e55969b039442c2a73805ac9e4938da6e2183965908c73b832fe0ae6a60f7aaba6e70a9e2a320e232ca94dd46413875c3f140efbd"

RPROVIDES:${PN} += "libtcmalloc_and_profiler.so.4()(64bit) \
libtcmalloc_and_profiler4 \
libtcmalloc_and_profiler4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libunwind.so.8()(64bit)"

inherit rpm
