SUMMARY = "Dependency package for imb_2021_3-gnu-mvapich2-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-mvapich2-hpc provides the dependency to get binary package imb_2021_3-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-mvapich2-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "751d48efcb0927675244a2d21a4e1529971d7379c0a730e5749e9ef4a66cb18b27a748ce30cd7789ae442dcbde40d43b706ebfbf98bb1bffc97bbcf82d621521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-mvapich2-hpc"

inherit rpm
