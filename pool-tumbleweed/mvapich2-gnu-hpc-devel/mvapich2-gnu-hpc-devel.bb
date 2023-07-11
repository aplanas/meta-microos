SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-devel-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "61f20752ccc2c5b8026babeb52f568f102441ea35ef58c606d411fe4063a8f9f5fabf2a3fced7646e7a89c93fb93424c2826afeb6200de994fad35421e4a5333"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-devel"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-devel"

inherit rpm
