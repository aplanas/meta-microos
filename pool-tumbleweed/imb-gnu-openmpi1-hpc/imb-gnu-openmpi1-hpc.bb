SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi1-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi1-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi1-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "583fd83607d36edf58745a4a8e310afa315284be00cdcc5ade635fa7bd7ad0baf5b014b2fcac1edae74ad945e4e8c7dd48a0f4630d8d95f8029f8ed72cfd3a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-openmpi1-hpc"

inherit rpm
