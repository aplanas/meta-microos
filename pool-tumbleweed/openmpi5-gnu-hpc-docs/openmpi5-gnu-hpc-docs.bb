SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-docs provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-docs-5.0.0-4.1.noarch.rpm"
RPM_HASH = "dbed171acf6730c8364b48a140f316f572d143e1efee2a11188e0500ef9c43c86dee1e4d5013fdfa5f7cda3113b7646ce6050c1bc844ed3c9290bfc936e251ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

inherit rpm
