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

RPM_NAME = "pnetcdf-openmpi1-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "d7b6b43840202184307860fba8a07d17120cf199038ea6d36929e2e6f5c4bfc8f4f00e855d99814e4c25fcd8ba757392a967686835683daed77651804c75a7fd"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1 \
pnetcdf-openmpi1 \
pnetcdf-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpi.so.12()(64bit) \
libpnetcdf.so.4()(64bit) \
libpnetcdf4-openmpi1 \
openmpi1"

inherit rpm
