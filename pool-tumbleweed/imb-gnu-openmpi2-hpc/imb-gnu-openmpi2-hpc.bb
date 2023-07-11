SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi2-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi2-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi2-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "7cd34dc018f94c15cadbf00042d2ef1a0d806ac85fe920c7846e545762aefb62c30247f0f8b5c1e32d74741456e6e08798313168a9f7018c0ed1a8d926d5555d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-openmpi2-hpc"

inherit rpm
