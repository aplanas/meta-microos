SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "068e6d307c2300043a6f819f5069b6948bb59d83874dbb8857daff1ac30aa2f701d2b4898054a5d84d799e93a1582ac5e222dc15f5eba6e5e42911a3d37af328"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
