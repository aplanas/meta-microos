SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel-static provides the dependency to get binary package mpich_4_0_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-devel-static-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "0cb731bb54c138be63ce4d73051e234de1e2856d52a4504415a25e20ad105ac18c830910d9e49c2a93d65bd148dae55d7420bbcbf2b4069b4e7f14228855c511"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel-static"

inherit rpm
