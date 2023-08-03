SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "libasan8-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "e01e64483163f3d5b29af22a75b9301d7d5844e9549fa7867102075a0e4056d3b1ecb59ef6798f87f865b528c1f2f1ed981f86dbe2a8bcd4fd561487280987fa"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
