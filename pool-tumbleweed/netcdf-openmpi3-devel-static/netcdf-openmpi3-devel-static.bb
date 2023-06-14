SUMMARY = "Static development files for netcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "aac736f0715a854bd8c936f97e21608461ef5657a8e4750d697dabbf90c787499a14e14d83207841982bd03086930a43b12a0bcb9fb2b394037c3bdb032af2f3"

RPROVIDES:${PN} += "netcdf-openmpi3-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi3-devel \
libcurl-devel \
zlib-devel"

inherit rpm
