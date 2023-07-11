SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "daac19db42f55e3f746fe8bb0d74150119fb045ec7a22df804cec5e9ad8481d2aed7476fdb62069739aa5e61788231aaa8dc676dcb95ec22413d9c27eecd78eb"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
