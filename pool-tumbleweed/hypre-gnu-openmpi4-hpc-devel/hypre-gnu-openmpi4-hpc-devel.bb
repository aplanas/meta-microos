SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi4-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi4-hpc-devel-2.20.0-1.24.noarch.rpm"
RPM_HASH = "fa41a219cb808e7c30565d628ac0188cb2cb7ceeb83666d18488ccf0f02fd801f30aa43c3e9a74a3853ebf0dd68b01da7c5c10d23e47de2ab5f376d8e43ef245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi4-hpc-devel"

inherit rpm
