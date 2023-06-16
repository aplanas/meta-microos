SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-examples-5.3.5-3.2.noarch.rpm"
RPM_HASH = "060b468a0d1ae91609d718e3ab9752adde43a400ba1bf667782c05c465ac81d40535ad2eca6cb4073bb8f8cc1fe0d663b2c4283e0fd7b507bf9b52ebe8b99fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi4-hpc-examples"

inherit rpm
