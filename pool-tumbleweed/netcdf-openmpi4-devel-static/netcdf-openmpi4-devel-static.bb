SUMMARY = "Static development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "3f8c34b4cb124f65bc17733c7fcb4623482af95afd43043ec553850c11c9bcf5c52d7e4367589a55185c02b4d8ac5fe48b3376eb80700ba5063e916d75bf5966"

RPROVIDES:${PN} += "netcdf-openmpi4-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi4-devel \
libcurl-devel \
zlib-devel"

inherit rpm
