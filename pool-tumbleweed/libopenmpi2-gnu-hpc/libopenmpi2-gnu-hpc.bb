SUMMARY = "Dependency package for libopenmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi2-gnu-hpc provides the dependency to get binary package libopenmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "libopenmpi2-gnu-hpc-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "f72399ccf52cdae2181bbac5e6ac934ca7bfb8b649221d2fc93cc6720428a37c71b70ee0911a6739e17c79badba7877b57a01ff082a08accd88f069acf564126"

RPROVIDES:${PN} += "libopenmpi2-gnu-hpc \
libopenmpi2-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "libopenmpi_2_1_6-gnu-hpc"

inherit rpm
