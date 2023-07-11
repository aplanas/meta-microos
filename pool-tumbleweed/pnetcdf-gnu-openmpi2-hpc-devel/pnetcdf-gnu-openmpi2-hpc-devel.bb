SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi2-hpc-devel"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi2-hpc-devel provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi2-hpc-devel-1.12.3-1.4.noarch.rpm"
RPM_HASH = "f1e49005bc346cb499b69203815e37773bfdfc2871fff9b66b8851d6b154de3cab54d9c40fd977af874dd366714bb3724e128fd5f2822841a88879210f918a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi2-hpc-devel"

inherit rpm
