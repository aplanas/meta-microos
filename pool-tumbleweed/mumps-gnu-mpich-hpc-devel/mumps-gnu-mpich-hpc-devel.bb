SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "c15c66c8a067236510ec6058f64c29652c16aedc19c78c63f066f9a5d508a17dc0acb590ac7a8d2a2317631f879dcdcf2c31664acbfed8f69a8535e578284965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
mumps-5-3-5-gnu-mpich-hpc-devel"

inherit rpm
