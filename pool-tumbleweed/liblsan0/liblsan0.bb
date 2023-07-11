SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "liblsan0-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "38593614485619becb25ac376426a145d319c9a6e51368638c23f599e70540b30325f028b7be14a91799ffdc2a65fbb1ac90536a54013d8a7c3e12baa181ee48"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
