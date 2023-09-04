SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "2496c02da3312462fc21d3636e720da3f3d27ce8ec1cb7eb3fd03b350615692ddf2aa16b772c396f493747f100744d21c9ae06fb88f9704e1056a183eb082fb2"

RPROVIDES:${PN} += "mvapich2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mvapich2-2-3-7-gnu-hpc"

inherit rpm
