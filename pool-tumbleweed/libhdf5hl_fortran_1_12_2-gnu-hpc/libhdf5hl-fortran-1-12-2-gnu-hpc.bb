SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "057a00a91fa17687ad5bcfce77e99b15133421111b1e53875a1555c13e3947f4d1824e831a6446e84a5361228b2fd191799908aad598c316888f6b1da2cf987d"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
