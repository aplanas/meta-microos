SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi3-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi3-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi3-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "fda3d15c1e97126846ab4e3aa4372c6e9ba076aa0c460bd6a02b961280938a2f196cb4d7f9a8304b293fc2aa9737d781beee64e3d941dbab9c96e21bea055b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-openmpi3-hpc"

inherit rpm
