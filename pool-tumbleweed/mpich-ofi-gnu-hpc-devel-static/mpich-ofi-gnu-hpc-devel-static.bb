SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel-static provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-static-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "fe2590d9851d428351be3b691d00eb54057015281580efc1179bd38d46fb0ccdc586c488b5429c6c085349945c93d4058d741fdd66813dd2f5f43e5ecbc43e49"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel-static"

inherit rpm
