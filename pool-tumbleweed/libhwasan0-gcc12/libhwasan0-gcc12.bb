SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libhwasan0-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "a253bb586e55eef56a9f5ccddf16535b93ac6cbef397917345d3f430ae6b556b2a4286872c06cb908cbeb75133c5e456f5e716c4b272ec6842b34acc02ba7eb8"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0 \
libhwasan0-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
