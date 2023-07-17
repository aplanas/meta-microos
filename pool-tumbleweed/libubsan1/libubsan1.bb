SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "libubsan1-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "623bec6bef409a3129d057992c3ff74c6ba4d6451243ccca9520c23ad75f5ae637002c5e54b567e7ebc4d0ab0740368d2b9473cf4ac4a850275fdadbf77b86ad"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
