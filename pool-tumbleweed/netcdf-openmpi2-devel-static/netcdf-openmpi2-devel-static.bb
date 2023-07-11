SUMMARY = "Static development files for netcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi2-devel-static-4.9.2-1.2.aarch64.rpm"
RPM_HASH = "d1842e61294dc29286d6f58a0a8defa854afd241da1fbb94368fca1a26848b1063914668a62b6666edb12b8428a6197ce8df952c8dfd7d572d1b7a1167df9059"

RPROVIDES:${PN} += "netcdf-openmpi2-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi2-devel \
libcurl-devel \
zlib-devel"

inherit rpm
