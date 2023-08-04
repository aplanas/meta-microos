SUMMARY = "Dependency package for mpich_4_1_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc provides the dependency to get binary package mpich_4_1_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-gnu-hpc-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "766ae4d9d51557121314f973aa9c98b9675de760d37723e674bf305a23783dd7f76ea33026b229f15f2996ac90a2823783f843d76fd49b5ddb34bc184df49c6d"

RPROVIDES:${PN} += "mpich-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpich-4-1-2-gnu-hpc"

inherit rpm
