SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mpich-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mpich-hpc-1.12.3-1.4.noarch.rpm"
RPM_HASH = "c59b84751e4504f945d8007c58e1bb35588fac3d55df4baf4e3facdefcf6fb6e705dfa6b0c04fad21c78793c948baffa368035390ec4a596f82df045705f9bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mpich-hpc"

inherit rpm
