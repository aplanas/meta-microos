SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "2dd5d27cd213261144a923d9db703590e2ddc4e71cc05493ce31eb2da745183b3b54e213c066576348cc2c03ab46fb05cc13f79452bdd32aeb6647164ddd7cd5"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-hpc"

inherit rpm
