SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libtsan0-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "72b78660bf2f963b1973ac77ac99e01ef0d3a9e52313badf9d2e11e17a364cbd1263e6b0958b465131c7c6e5147b137abaefe05a8a5d4a69ab4aac41536d3c21"

RPROVIDES:${PN} += "libtsan.so.0 \
libtsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
