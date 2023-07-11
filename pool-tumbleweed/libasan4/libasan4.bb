SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libasan4-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "920e781bde760b24773a9676bc5a007445d42eadf31cc564b3edbdc7d037414bd943d444fda7eb8d3bee931f98b33adbfb7453e39715ae0c8d2b0add4049dc2e"

RPROVIDES:${PN} += "libasan.so.4 \
libasan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
