SUMMARY = "Static development files for netcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "ef693222407e72ccfd37dc3f925149d572a1e326a89b519e9ba711e168b6993234203647d8c426e52929ff90c6611b3c5e1d48844ebbaba132dd5a73aaa6d1b8"

RPROVIDES:${PN} += "netcdf-openmpi1-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi1-devel \
libcurl-devel \
zlib-devel"

inherit rpm
