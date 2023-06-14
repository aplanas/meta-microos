SUMMARY = "Dependency package for netcdf_4_9_2-gnu-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "616b4a1baa0b0cc9e15c30a05651cf4c5812f56f75699864e9a23b4438a20eb5a327f9af911186378a81ec3bac4c7cabdf1c641cf36c682246c8ac9992e21d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-hpc-devel"

inherit rpm
