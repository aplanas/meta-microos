SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libtsan2-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "2096ea5a615856df5da5e93f26c2307306c26ef79ba1b18e2c60146af23f551f39b8de761bb05cff65ad20505f34cf3b6db48f5c322ada3727a72212e0e6ae7d"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
