SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "73ccec4fb84c50ab934f9a63fff3627cfa6f2100edd1593c12dcc4117d05ee95b147afe4c3c85a0ef8759cbaa6b4c8ba017fffcd32abfcb06fdafa7d544be99c"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
