SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "4e33c2bd851c07a6a06d59082435895cb3478ac55e87c70154c416e6386ed898b810acc8cc063f72dd9543e1e8bc256f7b3c1933f3e1f4380bbe98f185cbadec"

RPROVIDES:${PN} += "netcdf-openmpi3 \
netcdf-openmpi3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5.so.200()(64bit) \
libnetcdf.so.19()(64bit) \
libnetcdf19-openmpi3"

inherit rpm
