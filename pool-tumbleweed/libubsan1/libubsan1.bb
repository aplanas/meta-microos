SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libubsan1-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "b9682036043bcf93bf1198e57bd3e9ce6e8ca813948cd39c369e769472ce8a076f4fccb0515fd4eb70bfdb863f6a8b637be0db6e7d2a77acfa9b41915d597e83"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
