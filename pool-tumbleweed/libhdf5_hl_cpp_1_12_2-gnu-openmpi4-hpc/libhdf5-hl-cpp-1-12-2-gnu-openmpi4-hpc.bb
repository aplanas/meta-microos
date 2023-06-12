SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "ac28aed66ed87970964232b37a483a42c96e51d773a90ff8fbda51d882b7da7407976e8ae5daa39caf1b6bfb1227247a915423fd48a09ac899951e453cdf878b"

RPROVIDES:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc \
libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm