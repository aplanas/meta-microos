SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the shared libraries for ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-libs-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "6e5fa252719e095934bd2134aa04bc8c87d808501def770e36709e569f60e29dd0697dfd2fc505103ff10fc3885cda2d78c7c08728db134b1f770f17cd46528e"

RPROVIDES:${PN} += "ThePEG-libs \
ThePEG-libs(aarch-64) \
config(ThePEG-libs) \
libThePEG.so.30()(64bit) \
libThePEG24"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHepMC3.so.3()(64bit) \
libLHAPDF-6.5.4.so()(64bit) \
libRivet-3.1.7.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfastjet.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit)"

inherit rpm