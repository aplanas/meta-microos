SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "libxbase64-1-3.1.2-1.23.aarch64.rpm"
RPM_HASH = "adaca8d4d7fe2a338eef17d2a415bb2e31de975a2e10b221d1fcebbeb0619b3c12f8a0aebfb916b304b34c116ba4caae1560f04cfd34e56b11d4bb10a3cb7b3f"

RPROVIDES:${PN} += "libxbase64-1 \
libxbase64.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
