SUMMARY = "Dependency package for mpich-ofi_4_1_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel provides the dependency to get binary package mpich-ofi_4_1_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "566cba2fdbb454111ba034461cb08a0c779e665d4cec5096e577fa31738b5037a71b2f890201a15e8ef5797ec16f6887906719fb140b49009f871870224571db"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel"

RDEPENDS:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel"

inherit rpm
