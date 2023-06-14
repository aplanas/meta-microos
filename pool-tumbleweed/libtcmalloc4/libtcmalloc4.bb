SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc4-2.10-1.5.aarch64.rpm"
RPM_HASH = "bcf50df884bf308fd7f6c76b7adebf6e82836414f842095cd6fb74e34d4e280e634d9de1383d05d7f9da4c638ba2d002d7d375d41b0bd5ab787bd3b3676b12e2"

RPROVIDES:${PN} += "libtcmalloc.so.4 \
libtcmalloc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
