SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "71188d96e8819761c701e7c420cd20ba823051cf0beccad9f7743afb7887cee5984834f7fa0c7565e3fb4eaf78df3184484ab4f499597743be7bf0eee56083e1"

RPROVIDES:${PN} += "hdf5-openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-fortran200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200 \
libm.so.6 \
libmpi.so.12"

inherit rpm
