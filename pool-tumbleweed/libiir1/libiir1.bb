SUMMARY = "DSP infinite impulse response realtime C++ filter library"
DESCRIPTION = " \
An infinite impulse response (IIR) filter library for Linux, Mac OSX and Windows \
which implements Butterworth, RBJ, Chebychev filters and can easily import coefficients generated by Python (scipy). \
The filter processes the data sample by sample for realtime processing. \
It uses templates to allocate the required memory so that it can run without any malloc / new commands. \
Memory is allocated at compile time so that there is never the risk of memory leaks. \
All realtime filter code is in the header files which guarantees efficient integration into the main program \
and the compiler can optimise both filter code and main program at the same time."
LICENSE = "MIT"

PV = "1.9.4"

RPM_NAME = "libiir1-1.9.4-1.3.aarch64.rpm"
RPM_HASH = "1b55069ec8897a9e64d5a8bc2e85698b85f2d5c076b44e2e164cf00f9bc2684e395470ddcb2260f6ca6166d781506261c3c6167a3b44b42ac3ea3e9f18341a21"

RPROVIDES:${PN} += "libiir.so.1()(64bit) \
libiir1 \
libiir1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
