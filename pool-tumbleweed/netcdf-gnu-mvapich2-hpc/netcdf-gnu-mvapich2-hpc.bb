SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mvapich2-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mvapich2-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mvapich2-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "fc963ee9c7de2a922b80ba57d60505c6deb420cc847f1d70494a0561a2903b7705d6ea89e847845c7bc5daeb1eb151fa7c38fea115adcff86fd2f738cd0d4629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "netcdf_4_9_2-gnu-mvapich2-hpc"

inherit rpm
