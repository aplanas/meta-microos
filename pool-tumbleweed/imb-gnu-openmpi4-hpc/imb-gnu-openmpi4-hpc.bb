SUMMARY = "Dependency package for imb_2021_3-gnu-openmpi4-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-openmpi4-hpc provides the dependency to get binary package imb_2021_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-openmpi4-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "dd22ae3b5a68c55da2d6e1a2d3bd6d38a9d419313296b630dd557010e5ca4ddbbac9dfe2bd364b72316fb0863089e94d368ff9314967b373388e0e50ae38ee4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-openmpi4-hpc"

inherit rpm
