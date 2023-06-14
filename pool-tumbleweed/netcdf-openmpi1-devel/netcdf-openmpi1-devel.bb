SUMMARY = "Development files for netcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "d56ad5c34d3f28feeeeb09e56203df7d106a82dafd88b91e393e7144d91d574d19cc8e7209e58b1c1b5bf2d0178fccff5ff71beb5616dc04eb379cc1e48c1752"

RPROVIDES:${PN} += "netcdf-openmpi1-devel"

RDEPENDS:${PN} += "/bin/sh \
hdf5-openmpi1-devel \
libcurl-devel \
libnetcdf19-openmpi1 \
netcdf-devel-data \
openmpi1-devel \
pkgconfig \
zlib-devel"

inherit rpm
