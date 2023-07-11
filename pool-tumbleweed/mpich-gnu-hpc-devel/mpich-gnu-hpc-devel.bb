SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel provides the dependency to get binary package mpich_4_0_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "a8bee78ae96678add12d4b7c1e6ca018eace851e689671a39d3de448470fbfb84272e3c63cfbcf954895f31334bbc283c0e4ed87c9aa05a777048da9a45c08c9"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel"

inherit rpm
