SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel provides the dependency to get binary package mpich_4_0_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "c4d268e4292f6919fe12dd5936b49965432a1b62ae888255f8823ce119c76479b6df9205fcbf99775ca12cf8696e9bd188a3c14385c56e18730d75ebb8db0e3f"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel"

inherit rpm
