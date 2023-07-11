SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "9273bbd141f9bdb8b47b018d5dfbb5fa17d766b99fab3f4169cdf873262d0fb6a72185ef5eaa42fb6060584125782fdecefa3eb0847361895929486dd8f6394f"

RPROVIDES:${PN} += "netcdf-openmpi2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libnetcdf.so.19 \
libnetcdf19-openmpi2"

inherit rpm
