SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_debug4-2.10-1.5.aarch64.rpm"
RPM_HASH = "8560ec9aad59818dd5273536ea858b1fdba5de81cf4e7c25d11ce2bca3f31082d116b0e70b2734621965015108832cd3b18e48348e5cb83971336d8a0603d60a"

RPROVIDES:${PN} += "libtcmalloc_debug.so.4()(64bit) \
libtcmalloc_debug4 \
libtcmalloc_debug4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libunwind.so.8()(64bit)"

inherit rpm
