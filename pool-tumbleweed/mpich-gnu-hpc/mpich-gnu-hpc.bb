SUMMARY = "Dependency package for mpich_4_0_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-gnu-hpc provides the dependency to get binary package mpich_4_0_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-gnu-hpc-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "13aa63ce013d3949e2a106a77d935118f7746838ee7e04027dbd226fbd5e2f0a225d639593db91e9002ef039102324c7c2724de7b3efea544d5abc35f9bda468"

RPROVIDES:${PN} += "mpich-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpich-4-0-2-gnu-hpc"

inherit rpm
