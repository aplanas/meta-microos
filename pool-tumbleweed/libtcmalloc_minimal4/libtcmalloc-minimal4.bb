SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libtcmalloc_minimal4-2.10-1.5.aarch64.rpm"
RPM_HASH = "4916040f4c657f16d33926f376e54c3a85a40863805c3d577b3561e2ae8d01efda61da9e12acd973b4d26730aa3f1fd0f1be6195b4593d6586bd1464bd17e89f"

RPROVIDES:${PN} += "libtcmalloc_minimal.so.4()(64bit) \
libtcmalloc_minimal4 \
libtcmalloc_minimal4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
