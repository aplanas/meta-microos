SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "f0235dfadfcc9a43441e6c64f130233c1879c2264ef9e5b983cabf9cfd27feef6d50df98a83d17b06dca361c799b318e514ebd60649f604c7a7110ccf79ff295"

RPROVIDES:${PN} += "mvapich2-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
mvapich2-2-3-7-gnu-hpc"

inherit rpm
