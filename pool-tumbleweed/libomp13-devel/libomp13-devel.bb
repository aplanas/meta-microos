SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libomp13-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "0e8d0823d4b6091c54c83a86ef8be6314fe0bc4f9ab0aa8816225850280898a4cf019b7e32c5f8d2b7a733b6a6b9d2f4f644032dfef7fd74a37b76b210562b0d"

RPROVIDES:${PN} += "libarcher.so()(64bit) \
libomp-devel \
libomp.so()(64bit) \
libomp.so(GOMP_1.0)(64bit) \
libomp.so(GOMP_2.0)(64bit) \
libomp.so(GOMP_3.0)(64bit) \
libomp.so(GOMP_4.0)(64bit) \
libomp.so(GOMP_4.5)(64bit) \
libomp.so(GOMP_5.0)(64bit) \
libomp.so(OMP_1.0)(64bit) \
libomp.so(OMP_2.0)(64bit) \
libomp.so(OMP_3.0)(64bit) \
libomp.so(OMP_3.1)(64bit) \
libomp.so(OMP_4.0)(64bit) \
libomp.so(OMP_4.5)(64bit) \
libomp.so(OMP_5.0)(64bit) \
libomp.so(VERSION)(64bit) \
libomp13-devel \
libomp13-devel(aarch-64) \
libomptarget.so()(64bit) \
libomptarget.so(VERS1.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
