SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-devel-static provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-devel-static-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "ca88c09c78ed197ffedc71bad970e3724dd9b97c4949dfb0ddebf9986c204394912d5be291305cfb3c60aea7488835c878e720a3a4b0a7bc6f77743fcc9f981c"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel-static"

inherit rpm
