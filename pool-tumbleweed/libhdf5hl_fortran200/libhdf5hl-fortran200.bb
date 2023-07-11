SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8f0d98733fd5cdce93239b53cda647baa5ab8c334f5e3e3758dd4138c5e47f560e730a0d70c742efbef00019528a182837535e40885139423ab9ff16a29e125b"

RPROVIDES:${PN} += "libhdf5hl-fortran \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
