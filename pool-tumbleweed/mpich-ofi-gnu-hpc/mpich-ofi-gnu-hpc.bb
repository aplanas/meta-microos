SUMMARY = "Dependency package for mpich-ofi_4_1_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc provides the dependency to get binary package mpich-ofi_4_1_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich-ofi_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi-gnu-hpc-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "cedffbfb30abf5a1c86000d3fb9c90fe025747b67d4a9c6dedde46027cc5299057291186937003a938fab96e16a12db8bc8828d66a9e72acba40eb650e6c64bd"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpich-ofi-4-1-2-gnu-hpc"

inherit rpm
