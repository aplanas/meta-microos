SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libasan8-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "8e4278d36bfe24d0aa889b851866d8c739ddb612b1c0ce9089590dab00f6e3aed11763d499963f3a1b029bd5af93f4c67e91972ce1b547d9b822f82933cfe67e"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
