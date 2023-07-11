SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mpich-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mpich-hpc-4.9.2-1.2.noarch.rpm"
RPM_HASH = "3b4dc8535692bee5a18f30e0878a86bf12fbe8a4a90aed23fb4b4fc7d13c9fcf267280f7b4a70c8b8fd57cab103a08b95bf3bf56752ee7baf4302eb6b36b7ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mpich-hpc"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-mpich-hpc"

inherit rpm
