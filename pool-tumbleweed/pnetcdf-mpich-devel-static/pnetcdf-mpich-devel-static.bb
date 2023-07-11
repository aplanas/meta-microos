SUMMARY = "Static development files for pnetcdf-mpich"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mpich-devel-static-1.12.3-1.4.aarch64.rpm"
RPM_HASH = "8bc368fa5158e90a265a699736055e50ac50add14ae995618fc663be0208096538c4c8a1458747872be918c54d8e1d7b24558e9d70a8d12fa01f06ffafbcb1b3"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel-static \
pnetcdf-mpich-devel-static"

RDEPENDS:${PN} += "pnetcdf-mpich-devel"

inherit rpm
