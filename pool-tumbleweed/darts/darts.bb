SUMMARY = "Double Array Trie System"
DESCRIPTION = "Darts is a simple C++ template library to construct \
Double-Arrays [Aoe 1989]. Double-Arrays are data \
structures to represent Trie. These are faster than \
other Trie implementations. \
 \
Darts is used by Chasen."
LICENSE = "LGPL-2.1+"

PV = "0.32"

RPM_NAME = "darts-0.32-8.26.aarch64.rpm"
RPM_HASH = "242f0d11c215339b9c6ee329ff76dc600dd3a830e47f5d78dfccc4c5580ec8a80232e6b120343699e88e5468443a3ddc15ec1df364f422af6e50c1868aebfd95"

RPROVIDES:${PN} += "darts \
darts(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
