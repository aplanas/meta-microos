SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "4f6d22be7cd1433a4fea017b469e131eccba2e9a476e080473d6ca5aee0027e145e7090786557e3cff58fd77ee40ee54279de9992d18105cd2068e420ea8ffc7"

RPROVIDES:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc-devel"

inherit rpm
