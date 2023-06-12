SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2210eea3fd020df02ca31168088d7403d296bf608ce4f1769eb7be747a58aa3a1e9a4679876248f66f836712a40f4ff475eba8ac25ba110da0f98cbf4e05cc64"

RPROVIDES:${PN} += "libhdf5_cpp_1_12_2-gnu-mvapich2-hpc \
libhdf5_cpp_1_12_2-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
