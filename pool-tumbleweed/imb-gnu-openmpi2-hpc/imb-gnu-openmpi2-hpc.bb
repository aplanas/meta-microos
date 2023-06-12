SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi2-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi2-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi2-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "35d4f9d5544a9b952ce33c28cfa3ebf964ffb47e27fb7de1b9b042ab440228efb7f56b46417d798ee5d247f065977c97447c8a2dc36b6c150e9627368b3391bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi2-hpc"
RDEPENDS:${PN} += "/bin/sh \
imb_2021_3-gnu-openmpi2-hpc"

inherit rpm
