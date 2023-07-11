SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_and_profiler4-2.10-1.6.aarch64.rpm"
RPM_HASH = "64c19a185ec6e50479e2959ca65e3c7516b944ebe2e1739ae45c348c17db119d83d6d6c20c09d771451ef047dc0daac099c523262bb0331ce8ff9e47f49f774c"

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
