SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mvapich2-hpc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "c0fb2a4f588d850f145e111ecc1f51bf79232236f3da4a61e9fd995870913988025cfd5f4b4cfd89659e5d8b2483db46b4bf4cb395c35407e209df0511d730eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-mvapich2-hpc"

inherit rpm
