SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "9ccca0cc25f64a924682698b97c901aafc988874c7ca347267f406b324833e53a692232240b55e25d67f2175a166d308de786968c08f6a895fe1b002bbd657d9"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi2-hpc \
pnetcdf_1_12_3-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpnetcdf_1_12_3-gnu-openmpi2-hpc"

inherit rpm
