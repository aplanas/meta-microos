SUMMARY = "AV1 Codec Library Tools"
DESCRIPTION = "This package contains tools included with libaom, a library for \
the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.1"

RPM_NAME = "aom-tools-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "4c306873fa222473c94325d8b43d3aae4ba97cb29585b2585e1110ee38a68263eb4c56bda70a951eddc07e286a987341007d170f67c7b0e43dba125d625ee17c"

RPROVIDES:${PN} += "aom-tools aom-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
