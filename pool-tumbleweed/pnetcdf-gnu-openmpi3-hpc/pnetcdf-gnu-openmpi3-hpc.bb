SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi3-hpc-1.12.3-1.2.noarch.rpm"
RPM_HASH = "27dba87c751982f75669a56727f602927a3db27788040b991acbb755aef097eb531ba67aaa97bad31940faed98686dd647665974a52d7a677eb38370250a0696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-openmpi3-hpc"

inherit rpm
