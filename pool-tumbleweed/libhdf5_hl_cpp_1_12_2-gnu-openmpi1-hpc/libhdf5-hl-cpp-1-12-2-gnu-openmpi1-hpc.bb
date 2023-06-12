SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "c63bed0c05fee915a83dd4606131fa5a7b15ca134f12e556077f6d9caa2f82c2b975f4c98d66b848a707c8177ae8ace78e2ff5a382ffc49810fc0f5c583ce192"

RPROVIDES:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc \
libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-openmpi1-hpc-module \
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
