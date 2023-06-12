SUMMARY = "A Bonnie-Like File System Benchmark"
DESCRIPTION = "Bonnie++ is a benchmark suite aimed at performing a number of simple \
hard drive and file system performance tests."
LICENSE = "MIT"

PV = "2.00a"

RPM_NAME = "bonnie++-2.00a-1.3.aarch64.rpm"
RPM_HASH = "bc53f13ce9f4ea9cc650ce041c778d2d247c9d033678f89eea3b2de4e60380ca547860d54c9a6541b15712e309d5c201940916a5eebe043af9cd52b35ae0dee0"

RPROVIDES:${PN} += "bonnie++ \
bonnie++(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
