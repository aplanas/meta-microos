SUMMARY = "Algorithm to find the maximum clique in a graph"
DESCRIPTION = "MaxCliqueDyn is an exact algorithm for finding a maximum clique in an undirected graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "mcqd-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "eab9060234035318c77745c731af85b64b197973ad17085ae8409bc9b4ee61ba6f7a18eec9c78f41f0b0e54b19c921eeb084ed985d9696caf27a75fe85adca72"

RPROVIDES:${PN} += "mcqd \
mcqd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
