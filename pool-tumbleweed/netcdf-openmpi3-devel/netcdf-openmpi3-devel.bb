SUMMARY = "Development files for netcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi3-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "3abf04f60b351f991e6b1712837ce169ea1ee8fceb3f1f3c652e9648f8620f9254ab3615ca1a72ead1fb10a2c0c80e19552c35c356b1999f03e495ee7f836b76"

RPROVIDES:${PN} += "netcdf-openmpi3-devel"

RDEPENDS:${PN} += "/bin/sh \
hdf5-openmpi3-devel \
libcurl-devel \
libnetcdf19-openmpi3 \
netcdf-devel-data \
openmpi3-devel \
pkgconfig \
zlib-devel"

inherit rpm
