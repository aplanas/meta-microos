SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi2-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi2-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "d0b65977eaa9a3f325b2aee2feffb8907a7bcbaf4c09600bfc9152bb4939a0a4aeba7e2ee2dbbf5360c623c768982f2bfb352307ffdc2046978ba8f030b2454f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi2-hpc \
netcdf-fortran-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "netcdf-fortran-4-5-3-gnu-openmpi2-hpc-devel"

inherit rpm
