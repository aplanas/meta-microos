SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi4-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "cf81b1f507513e9baaf44b4d3fd5f185ab79a61cfd44bbc24e59bdafe540afd9ccfde441d4064756308af515d38f35ca537333c4490be51619d966fef3e485ac"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi4-hpc \
pnetcdf_1_12_3-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpnetcdf_1_12_3-gnu-openmpi4-hpc"

inherit rpm
