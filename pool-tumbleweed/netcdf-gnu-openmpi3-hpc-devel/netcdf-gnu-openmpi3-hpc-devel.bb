SUMMARY = "Dependency package for netcdf_4_9_2-gnu-openmpi3-hpc-devel"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-openmpi3-hpc-devel provides the dependency to get binary package netcdf_4_9_2-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-openmpi3-hpc-devel-4.9.2-1.1.noarch.rpm"
RPM_HASH = "bec8c9f950dbe4d0546d27dc4ff5c9a0b754d83d43a0683e4fc8170560b16b8c6549a0e18cefe635920da23b4b53bb8caf27267e3cb834d6e931ddbc103b277f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "netcdf_4_9_2-gnu-openmpi3-hpc-devel"

inherit rpm
