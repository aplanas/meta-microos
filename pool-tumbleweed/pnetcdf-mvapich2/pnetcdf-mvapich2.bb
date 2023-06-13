SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mvapich2 version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mvapich2-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "da3ce6b1015b4046eaadc5afabaa52dfe5158025e8ed1686005511b2a1c28342248a1ae5470e69030c1928bc70f9675cb26faeb5edeb183d7d5bec88c0d044bd"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2 \
pnetcdf-mvapich2 \
pnetcdf-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpi.so.12()(64bit) \
libpnetcdf.so.4()(64bit) \
libpnetcdf4-mvapich2 \
mvapich2"

inherit rpm
