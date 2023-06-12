SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "158133106cfe2bfd5b8115f82c50321c7f1af83e19b853f516e94e668fe0fe3dbad11ae5c2771bdd6973098244b0a5968e20c4c5fbb67cd9a32f0ce05bf162a7"

RPROVIDES:${PN} += "libhdf5_hl_cpp-openmpi4 \
libhdf5_hl_cpp.so.200()(64bit) \
libhdf5_hl_cpp200-openmpi4 \
libhdf5_hl_cpp200-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhdf5_hl.so.200()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
