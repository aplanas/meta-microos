SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi4-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi4-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "0cf8d63f804ad644433e4dcfea5ca379f008a3d5b8b3b59da19126ec51a78a47797a4440a30ce0b5d76eb658be0b7f0725ea7aacef7320cbc517daade3fea2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi4-hpc-devel"

inherit rpm
