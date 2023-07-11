SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "2d07fe87f77847061a789b65ab297e1034a58b78d4723dd87abff8c8c4d537602665cc1eecc912080031b76df4c09fd4495950ab6b375c70ad1ea66b5a3b3d7a"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi3 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
