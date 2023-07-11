SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "6377157e07b1d43525cf0469fff9091193cfa587cf582d1b8a67d5bb4bf251c05d98b31e07358eae386f0b340502120d9cfd3c61f7f119defaf650ca6af34793"

RPROVIDES:${PN} += "netcdf-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libnetcdf.so.19 \
libnetcdf19-openmpi4"

inherit rpm
