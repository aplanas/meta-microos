SUMMARY = "A Fast C/C++ Compiler Cache"
DESCRIPTION = "ccache is a compiler cache. It speeds up recompilation by caching the \
result of previous compilations and detecting when the same compilation is \
being done again. Supported languages are C, C++, Objective-C and \
Objective-C++."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "ccache-4.8-1.3.aarch64.rpm"
RPM_HASH = "91b42f56fab5c2692bdae73b1e81853f734c597cde632e05e90587d93cee7dbb151d0bfa43abe3b3192d863a6a7666cfdae16ee6c24bb3a052e1f5fbe1fc8ac7"

RPROVIDES:${PN} += "ccache ccache(aarch-64) distcc:/usr/bin/ccache"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libzstd.so.1()(64bit)"

inherit rpm
