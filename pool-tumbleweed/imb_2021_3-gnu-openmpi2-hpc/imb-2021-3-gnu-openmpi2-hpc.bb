SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi2-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "aab54045198c08b0a25dec8bc9a70f33c161be9672d6b7aef0c33abf019890cdefae2fe3d70376dcb037ffc7c80e763e29b2b9e1884963d096e3ce6a5aed5ad5"

RPROVIDES:${PN} += "imb_2021_3-gnu-openmpi2-hpc \
imb_2021_3-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libopenmpi2-gnu-hpc \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
lua-lmod"

inherit rpm
