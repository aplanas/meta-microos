SUMMARY = "Dependency package for mpich_4_1_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc-devel provides the dependency to get binary package mpich_4_1_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-gnu-hpc-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "01a2480b4420ed6117150819f1da2257b91e0b2de679ed095a7fe3eafdad12cbc8da1a1d95bc61ee11f018fbd0d663be49fa93095f64eaf0aff74db2166c4481"

RPROVIDES:${PN} += "mpich-gnu-hpc-devel"

RDEPENDS:${PN} += "mpich-4-1-2-gnu-hpc-devel"

inherit rpm
