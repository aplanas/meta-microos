SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-16-1.6.39-4.1.aarch64.rpm"
RPM_HASH = "31ba0842f7e10dc2d0ee216a25609e9e67754db40a6201921f8a4b6ae43e2779109f1e86e3b7d14efbe8af1108a0d5c140ad7a8616a81eaa623bdf1716de41fb"

RPROVIDES:${PN} += "libpng \
libpng16-16 \
libpng16-16(aarch-64) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
