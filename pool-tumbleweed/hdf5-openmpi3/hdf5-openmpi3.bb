SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "105a6d097b85642d00a20b04b77420831a91dd6395a51c43fb96763d0ee6e232a7dd18edd4c735284ddee23de1f766ba443884c541af4d6d8d026c70f4536add"

RPROVIDES:${PN} += "hdf5-openmpi3 \
hdf5-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5-200 \
libhdf5.so.200()(64bit) \
libhdf5_fortran200 \
libhdf5_hl200 \
libhdf5hl_fortran200 \
libm.so.6()(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
