SUMMARY = "Dependency package for mpich_4_1_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel-static provides the dependency to get binary package mpich_4_1_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-gnu-hpc-devel-static-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "6f97225e80406298e51442103c5fb540cf955d3718865af60b90ef64b00fc2c6ab946bc62dab73f865d0d1d796c930618e05e9a763f90b52b2f69b3a2dfc02bf"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-4-1-2-gnu-hpc-devel-static"

inherit rpm
