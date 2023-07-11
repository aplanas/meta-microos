SUMMARY = "Development data files for pnetcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains generic files needed to create projects that use \
any version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-devel-data-1.12.3-1.4.noarch.rpm"
RPM_HASH = "d4cd78a88f119bb38d9a99c638976be4b76a94f9ad03db5fe054afe5242412d9dfc99728cae0534a5d3b8c77d294e4286cefbeada050e7c07908758b8d2c7a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel-data \
pnetcdf-devel-data \
rpm-macro--pnetcdf-sonum \
rpm-macro--pnetcdf-version"

RDEPENDS:${PN} += ""

inherit rpm
