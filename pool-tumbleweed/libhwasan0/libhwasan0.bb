SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libhwasan0-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "5e4e02fd98d5a7b3d52e93aa21c7232106df7028728ee6d4c04c3abc098de9ac70cf7acef9182ace16b05dcc164eaef4956c38ce7f4aa241db25aa2ba9df7ec3"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
