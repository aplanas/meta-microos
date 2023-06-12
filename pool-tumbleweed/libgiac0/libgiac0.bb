SUMMARY = "The core library for giac"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "libgiac0-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "5064bcbe8114cf79953888aa495055685262b6033667933ee2228135ed5423bb8a864894bf9f3dffc7e984147cda650a2b7c9738d8b73215e3af0ac6f1fc1a64"

RPROVIDES:${PN} += "libgiac.so.0()(64bit) \
libgiac0 \
libgiac0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libao.so.4()(64bit) \
libao.so.4(LIBAO4_1.1.0)(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libecm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libglpk.so.40()(64bit) \
libgmp.so.10()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmpfi.so.0()(64bit) \
libmpfr.so.6()(64bit) \
libnauty-2.8.6.so()(64bit) \
libntl.so.44()(64bit) \
libpari-gmp-tls.so.8()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
