SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-mvapich2-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-mvapich2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-mvapich2-hpc-1.12.3-1.4.noarch.rpm"
RPM_HASH = "b17b93c366a1e1d8de4a9ba4bc7f3f29805ddf16226ffca620966ce3c1bde42b15c4e3808dd14244798640be255bb5acb0c60101d10a960053b691a3f8c9010f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "pnetcdf-1-12-3-gnu-mvapich2-hpc"

inherit rpm
