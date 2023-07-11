SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc4-2.10-1.6.aarch64.rpm"
RPM_HASH = "de22c82a06b7be2747c58833dae51ae5e401ad6b3b34d754f242e1cd5a3fe09c650669b365a3cf64251a44a33423586d9262f4421c815b1cef2603470fb14d5a"

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
