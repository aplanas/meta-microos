SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "62b48bbd37e558034874cd62969066765a97594baae309909ebee531ac4b644669b29d09515edfcf8cdb12c604df71b9ca6d1bec77990c24830111d0e42c750d"

RPROVIDES:${PN} += "libhdf5hl_fortran \
libhdf5hl_fortran.so.200()(64bit) \
libhdf5hl_fortran200 \
libhdf5hl_fortran200(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_fortran.so.200()(64bit) \
libhdf5_hl.so.200()(64bit)"

inherit rpm
