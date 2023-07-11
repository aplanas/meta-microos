SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "69a79886a82a7fe061298b265521cf92766fe1c480e1a33cf270b4fcd65906dfed8814be0bc8563b8ccea2a8832e9e92b7b0730042248070080a285625518bc8"

RPROVIDES:${PN} += "netcdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libnetcdf.so.19 \
libnetcdf19"

inherit rpm
