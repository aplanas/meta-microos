SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libhwasan0-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "e7551421b423b3d35c44320ff39ea8948aa1501c90de760093ecfe9159aabc4cde8a301e56a1d47fce261f9ca6dd1bb0a5660481747fafb1b0e78cb1c33b50bf"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
