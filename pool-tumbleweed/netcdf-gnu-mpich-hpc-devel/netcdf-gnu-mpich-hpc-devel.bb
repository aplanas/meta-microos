SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mpich-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mpich-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mpich-hpc-devel-4.9.2-1.2.noarch.rpm"
RPM_HASH = "c80978b47206a654b449b2777de7dba6af38e68ba282c08fd122ba5d7566a7b2c5a170cd42e580e6794eac5e57043d4739226d6f7df110906fb57b9e47bedfc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "netcdf-4-9-2-gnu-mpich-hpc-devel"

inherit rpm
