SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "libtsan2-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "edfb5ffe865a8eb5e5dea28cbb03216d4c320c1b02333979c029e011c89e9f1081469527be6b792f7aa45d13940e25d4d7f61b9bf67cacd0bd93337f72364916"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
