SUMMARY = "COIN-OR Open Solver Interface for Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "libOsiCbc3-2.10.8-1.3.aarch64.rpm"
RPM_HASH = "a7c955e76d2e0b718f53b32d2c3bd8a957e4f34fab05d6baae10587536fd70769b0fd811720bec49f8ff44c9aeffca28eff025e908961a410afccc400d4bd294"

RPROVIDES:${PN} += "libOsiCbc.so.3()(64bit) \
libOsiCbc3 \
libOsiCbc3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libCbc.so.3()(64bit) \
libCoinUtils.so.3()(64bit) \
libOsi.so.1()(64bit) \
libOsiClp.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
