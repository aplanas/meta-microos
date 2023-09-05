SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libtsan2-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "90a7bc95180aa6a4e9cbcf45095949f5e3a987f788e7f61c94b1e27c21c4e4ce3ea27b57b36c75fa0dafcbf3bc6e499975f96259b2a82a2dc4cf5de01d0b0f2a"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
