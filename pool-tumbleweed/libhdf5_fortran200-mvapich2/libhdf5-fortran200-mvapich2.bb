SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "0bc905782113b8e3caa0edb351d42141fdc9857ef20bc2e114477ef78ceaf6c44d2206e17dc179b486e8210294fd470f9bc5d74034dc6abd9c5223cc6b18bff5"

RPROVIDES:${PN} += "libhdf5-fortran-mvapich2 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.12"

inherit rpm
