SUMMARY = "Dependency package for imb_2021_3-gnu-mvapich2-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-mvapich2-hpc provides the dependency to get binary package imb_2021_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-mvapich2-hpc-2021.3-1.2.noarch.rpm"
RPM_HASH = "217d9731e865c6f7d33de8f2fe09008216bd303f91e5632bf17e350b8ded1ae18f2758ad7a267f7093d59a95090ff6f4df95d4f2615c2611c5b022bfafbf46b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-mvapich2-hpc"

inherit rpm
