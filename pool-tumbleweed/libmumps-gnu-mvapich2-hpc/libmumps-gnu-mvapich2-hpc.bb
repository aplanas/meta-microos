SUMMARY = "Dependency package for libmumps_5_3_5-gnu-mvapich2-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-mvapich2-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-mvapich2-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "115bbd90a207d07c749255e8788ab61dfd9840f0f53d6f6e5a3c61844680ba972deb783e1825b6dfc1759edbd1e901cb1ca9196e746e45bcf043fc6e04cc3e75"

RPROVIDES:${PN} += "libmumps-gnu-mvapich2-hpc \
libmumps-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libmumps_5_3_5-gnu-mvapich2-hpc"

inherit rpm
