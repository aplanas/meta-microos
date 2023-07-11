SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi2-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi2-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi2-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "472b660dba5b7b9a2de90eb079b84aaeb08058b0d929d460ce1d4e77179e038c57543a366a882b8db0e86f273ce70490962a813ee6e5f731604c2d97eb78a1e7"

RPROVIDES:${PN} += "libmumps-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-openmpi2-hpc"

inherit rpm
