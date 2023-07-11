SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_debug4-2.10-1.6.aarch64.rpm"
RPM_HASH = "7053254963d0d11ac46af1d9866b4e49f511e7da9ce01d5f5736763389ce93c8578eb4d116c01bacb305becc96147ecea3366c83763b399749eb85a6e7d05484"

RPROVIDES:${PN} += "libtcmalloc-debug.so.4 \
libtcmalloc-debug4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
