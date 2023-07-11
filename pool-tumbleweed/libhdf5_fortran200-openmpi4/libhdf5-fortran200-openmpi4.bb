SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "5bbe3db3d63bc8dc97884db977e3ab8bf8414a3b25c7f6da98de7d90d417ab345ac72a6288e5ee22b6b28325e6537204e7e6117b218817c3396f155406839a31"

RPROVIDES:${PN} += "libhdf5-fortran-openmpi4 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.40"

inherit rpm
