SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the runtime libraries for ICU."
LICENSE = "ICU"

PV = "73.1"

RPM_NAME = "libicu73-73.1-1.1.aarch64.rpm"
RPM_HASH = "4f64a30c6ef82933ce20b815b357ab27406f732997286ac080537e46c6f592330691b2eb3460748c41ef9675c1e6e95937e89e85fda1e38d77125d917d2d14ac"

RPROVIDES:${PN} += "libicu \
libicu73 \
libicu73(aarch-64) \
libicudata.so.73()(64bit) \
libicui18n.so.73()(64bit) \
libicuio.so.73()(64bit) \
libicutest.so.73()(64bit) \
libicutu.so.73()(64bit) \
libicuuc.so.73()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicu73-ledata \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
timezone"

inherit rpm
