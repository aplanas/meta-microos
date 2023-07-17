SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "libhwasan0-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "80f2e85fd1d7f11863fd135aaeef3221224a4d8e1e4e5966501912941eca2beb35bcc04dec465e81ccce6a90ac637c1310057cb8c497c8a94e29eec378a1aa03"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
