SUMMARY = "Library for computing automorphism groups and canonical forms of graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "libbliss0_77-0.77-1.8.aarch64.rpm"
RPM_HASH = "9caaf249b9fdfa9430559adbd8e06289d14a1acea20113569ef55814d8c6652521caac79f1c7d33211c6572ef8a1c114d7a7338900208cf3dbfcc04fc6cf1eab"

RPROVIDES:${PN} += "libbliss.so.0.77()(64bit) \
libbliss0_77 \
libbliss0_77(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgmp.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm