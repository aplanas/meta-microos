SUMMARY = "Development files for netcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-devel-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "75f0cdfd2bd941b6c7a62ea68693f51f920cae93b1d85018b37126a80a3822853dcd9c0a7f1cc653537b71ab29bc2f1da94a3b59154b393fd36ba4d8883557b7"

RPROVIDES:${PN} += "netcdf-openmpi2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi2-devel \
libcurl-devel \
libnetcdf19-openmpi2 \
netcdf-devel-data \
openmpi2-devel \
pkgconfig \
zlib-devel"

inherit rpm
