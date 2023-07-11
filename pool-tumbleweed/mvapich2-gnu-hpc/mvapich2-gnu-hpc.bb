SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "33b10a3d31ca9d0402cf75ae6678922b7f9250a246514203c4e35a95a2cf415343e2da9f964b297b21fe3421f203e8c5cb5b9520a08186f47ca82a5db8f450f2"

RPROVIDES:${PN} += "mvapich2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mvapich2-2-3-7-gnu-hpc"

inherit rpm
