SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi4-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi4-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi4-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "a3675e922078a52a820967d0590ef542bac86e53b6e9bf640ad16dbd4f00df5975f6fea62ae816d6630068e96753cb277c78dbd933ad162501b243553eec6702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
imb_2021_3-gnu-openmpi4-hpc"

inherit rpm
