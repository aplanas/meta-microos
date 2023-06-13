SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi1-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi1-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi1-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "e4c1b70ebf4e01b50b9b0a0c3fc4aa86c8330d958a8bfdadf8a649ed4d37038fc24baf6bd3b1fb46b8f5b019952e4da51afdc071ac7b8b2735a44ac2d0674556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
imb_2021_3-gnu-openmpi1-hpc"

inherit rpm
