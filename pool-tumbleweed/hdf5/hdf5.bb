SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6ad37973bef78d39cdfac7ca7f5eff1a45ebadd0faff0aebc65881c3e9ddfb333e251d692090f3033f11d1b2921086d523556d18e9ecf5023b32c38eb72f4786"

RPROVIDES:${PN} += "hdf5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-cpp200 \
libhdf5-fortran200 \
libhdf5-hl-cpp200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200"

inherit rpm
