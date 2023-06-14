SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi2-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi2-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi2-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "b8ef5b998c9e36e5eda06207c6c55bde091b5ac09d3d293cccbf9529d94147d5c350c573f852655d2d3e95aec8df603d2fe935c3d6f4cf8421012133f1059043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-openmpi2-hpc-devel"

inherit rpm
