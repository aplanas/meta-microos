SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "libhwasan0-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "3a9c7b26e0b36fbf19682d826328ca426237bdae8c8e6d57b2671d81d3cd81a68c3ed6e4f008f62e285bae6f9d9e838e3b83edc249a5a07624a1264ac91cee3e"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
