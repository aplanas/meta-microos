SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "4e8f858b8ed91ccc01a19f76bc2e4d0905eaf8fa246f16cea0cb1ef1af1a4de308d178051341bb018995d61d6035ed7b24a57886dc3711a53e02958801cc5bca"

RPROVIDES:${PN} += "netcdf-openmpi4 \
netcdf-openmpi4(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libnetcdf.so.19()(64bit) \
libnetcdf19-openmpi4"

inherit rpm
