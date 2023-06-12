SUMMARY = "A Tool for Computing Automorphism Groups and Canonical Labelings of Graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. It has both a command line user interface as well as C++ \
and C programming language APIs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-0.77-1.8.aarch64.rpm"
RPM_HASH = "cd9b96ea65f6e7a6ff62612bd1172d4a2bef5033fce463a11b65ff6760bd53c40fc9415e75f90364d7ed760e153b69df858dcb8874f3c17b2f6d1e79b6c30193"

RPROVIDES:${PN} += "bliss \
bliss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbliss.so.0.77()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgmp.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit)"

inherit rpm
