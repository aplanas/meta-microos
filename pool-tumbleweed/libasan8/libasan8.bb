SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libasan8-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e1dceecee5d8907fd922f28db6e4cad3ef6f9bf5899d7b3b1ec4a6578345d66e8f2772215fd1b32bf472214a89f19852c1d3d37b226bf04048b7d0039ad25576"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
