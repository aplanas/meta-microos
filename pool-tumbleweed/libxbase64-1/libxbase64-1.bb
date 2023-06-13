SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "libxbase64-1-3.1.2-1.23.aarch64.rpm"
RPM_HASH = "adaca8d4d7fe2a338eef17d2a415bb2e31de975a2e10b221d1fcebbeb0619b3c12f8a0aebfb916b304b34c116ba4caae1560f04cfd34e56b11d4bb10a3cb7b3f"

RPROVIDES:${PN} += "libxbase64-1 \
libxbase64-1(aarch-64) \
libxbase64.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
