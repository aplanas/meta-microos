SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "722288c6714cd99453958be103bd510a2e54072169a4549f0011455fd39739038a644243b315815a4d68af8d100eba1fb5b1a20838cbbe7019f849583b076dd8"

RPROVIDES:${PN} += "netcdf-4-9-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf-4-9-2-gnu-openmpi1-hpc"

inherit rpm
