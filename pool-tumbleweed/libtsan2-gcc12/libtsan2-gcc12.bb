SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libtsan2-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "a8b9ce2042854af8f460a87481da72f9378e96d00a4234b418a5d2fbfabf7826dddf90e0661c203e55b46c05b3025a457118dbbd5bb9362de9ca7653ccee00c7"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2 \
libtsan2-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
