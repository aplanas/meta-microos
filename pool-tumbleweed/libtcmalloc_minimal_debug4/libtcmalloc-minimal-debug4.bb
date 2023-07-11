SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_minimal_debug4-2.10-1.6.aarch64.rpm"
RPM_HASH = "33305529fb3e6ad501bf0997b856ef2a63f34669bd518472e716d1ad0f5d284321e59736edb2fe388941740f5e692ecbb306a59cfb35195514dd9ed44f16a4d2"

RPROVIDES:${PN} += "libtcmalloc-minimal-debug.so.4 \
libtcmalloc-minimal-debug4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
