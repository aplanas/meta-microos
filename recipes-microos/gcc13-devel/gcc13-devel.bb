SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-devel-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "4abaaccd21a28ad1a086e00f7eb64c697b3be6c7b0693680d772777ad13cc3c933bf6cc7361aebe9ee6e1a36731afa48c8cd1f22fc90996fe329a9d8695c7393"

RPROVIDES:${PN} += "gcc13-devel gcc13-devel(aarch-64)"
RDEPENDS:${PN} += "gcc13 gmp-devel libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) mpc-devel"

inherit rpm
