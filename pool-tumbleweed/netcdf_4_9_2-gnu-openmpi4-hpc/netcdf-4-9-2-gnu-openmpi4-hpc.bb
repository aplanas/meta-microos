SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "d1e079f7a9238ff0dfedd10c8ad94b24c91738ece364685cee32967dcf95fc2a4ef1d75c808a15f06b1c0dabf620904e60598bd3184a2dcc71adbd3136ad075a"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi4-hpc \
netcdf_4_9_2-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnetcdf_4_9_2-gnu-openmpi4-hpc"

inherit rpm
