SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel-static provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-static-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "df271d165f19a91971fb65ce5e8c577f4cdb8cf1f394e6f30dd0e27c20ce19f33abb35ceb2fa266feb20bed2dab7dfa1cd63eb66a0f00cacdd5ff04da41d812a"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel-static"

inherit rpm
