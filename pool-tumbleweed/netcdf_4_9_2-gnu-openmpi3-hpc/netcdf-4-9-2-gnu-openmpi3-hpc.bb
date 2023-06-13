SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "ddde4d0e64eb4cb5501be2c3d8dd5e9d5ae9c655581c76eaab22b6e0581b6bffdf7540edde72d69850cdd0ed32e6a1021486115b58208081b62541107175f996"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi3-hpc \
netcdf_4_9_2-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnetcdf_4_9_2-gnu-openmpi3-hpc"

inherit rpm
