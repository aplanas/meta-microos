SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "24495aba3a7d13ff5e4137163e8b0b95e9be9bcc58340b7cca010597f20dd1e1ce8eda1ed492a93ac0bae689c7d844913b977a4668872f795c7b576214d47400"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
