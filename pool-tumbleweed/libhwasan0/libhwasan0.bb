SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libhwasan0-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "092db32dc226190557f9424b69046e846c4697a119997b8b9f501d6d99be087c95a1d4884b0d58900cf697c1f94b9d85924c043df72fc47f96b1dee1e0ac64e9"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
