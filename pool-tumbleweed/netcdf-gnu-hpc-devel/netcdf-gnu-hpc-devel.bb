SUMMARY = "Dependency package for netcdf_4_9_2-gnu-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "9fa13452e866a9ae768f61d40cbaa9b60d0f0499b1b3d60be0f7f8cb2462884c9c324b0c4c059ec481f5766fa7f2cf7ac43d00498198c1cc7b24a448fcf0b289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-hpc-devel"

inherit rpm
