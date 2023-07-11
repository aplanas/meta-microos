SUMMARY = "Static development files for netcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "a84dd8376ffb57d728feb042235a61f2294d696fe3deb52d6fcc8983a786b40ea0c87b77d14202e5381b6680f94a26c2b6fd9f607db8c50178d1e3cf026325f1"

RPROVIDES:${PN} += "netcdf-openmpi3-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi3-devel \
libcurl-devel \
zlib-devel"

inherit rpm
