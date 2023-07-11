SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7e4409f13c4b35153a471b36eccf487d81cacfb683c54400767e03da5b10d67eaf99eef8af6fa19a558827eeff88e46c8c63b79f41588edf05e3d952c4db1a23"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi4 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
