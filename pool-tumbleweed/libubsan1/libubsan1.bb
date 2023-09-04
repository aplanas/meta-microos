SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libubsan1-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "8e77a8bc4c587bed7507d69334b3e63e65d6deb6862a2014c589f73cb5f4e626047d9c4a8d6878e872d075a6b67ee5732448dd53209b5bbc511ec234d95eeceb"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
