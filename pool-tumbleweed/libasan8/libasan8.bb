SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "libasan8-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "d4c1e58c40244c48c03a680c48937cf99a83c711b89a05d0151768951c9d82027a93f79155b5c31e3003a01bd8fe34e995a78d0c115836bcd4df067d0b651c2c"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
