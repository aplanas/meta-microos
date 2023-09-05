SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi4-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi4-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "0a1606313d1c9a2bdec18bfcb825b9a0fdbcc940cbb66b479c104d6b093103c35c35f9bf24fce20237fd5b5319ed54c052ee6e9e9e8892c6752e10a55e400d33"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi4-hpc"

inherit rpm
