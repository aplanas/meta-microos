SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-boost-histogram-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "fa1ce96bc76b61dac50dc905e17f9f6de996f9f31db667595cbd9fb0e5aa32abef55d0190a5fb8b2b2fab2e71e6e9e24f9ee9e2ba310094e564d53f5fa4361ae"

RPROVIDES:${PN} += "python3.11dist(boost-histogram) \
python311-boost-histogram \
python311-boost-histogram(aarch-64) \
python3dist(boost-histogram)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python311-numpy"

inherit rpm
