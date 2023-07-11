SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mvapich2-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mvapich2-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mvapich2-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "94c0e4a4520a79942509b4c97626b9384e0f9a01e5cface3d13cfc95dc29ad71a0445ecd66e2465b60d18a8c8ffa3e584e3ed884e903b87e813e3abc6206fc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-mvapich2-hpc-devel"

inherit rpm
