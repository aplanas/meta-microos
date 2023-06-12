SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-devel-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "a5e7d69075bf946561ffcdacead1ee9002534a66c7365849d1a90bb56310fa0fed7aa53b50b3793ce95d27dc3360af213b98c170d66f1ff7ea0822204cf6b3d2"

RPROVIDES:${PN} += "gcc13-devel gcc13-devel(aarch-64)"
RDEPENDS:${PN} += "gcc13 gmp-devel libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) mpc-devel"

inherit rpm
