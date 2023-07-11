SUMMARY = "Static development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mvapich2-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "de9bed3f30e318aef3f665f851b1e378927fe83345e6e1ddfc1b39d25a391315c3a50b2040d5a6276af6841421faaa0e28397aabe4b827b96b65d1108996dd26"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel-static \
pnetcdf-mvapich2-devel-static"

RDEPENDS:${PN} += "pnetcdf-mvapich2-devel"

inherit rpm
