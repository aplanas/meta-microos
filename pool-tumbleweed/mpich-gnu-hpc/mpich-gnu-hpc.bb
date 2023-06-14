SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc provides the dependency to get binary package mpich_4_0_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "4723a5c180f7be7f7f66c3bb1256af129840cb5a194595e35d37c0c5397b3593c94f89354a1e7b95123157e5d3c357a0e1011cec36c59331d62c8cd05e08cfa3"

RPROVIDES:${PN} += "mpich-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
mpich-4-0-2-gnu-hpc"

inherit rpm
