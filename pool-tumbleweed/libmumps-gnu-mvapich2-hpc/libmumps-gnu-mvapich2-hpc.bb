SUMMARY = "Dependency package for libmumps_5_3_5-gnu-mvapich2-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-mvapich2-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-mvapich2-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "a6a28ee74e7a5d75e73be09218cef8da3687a97469903218e1389ef934f8822e465325445e016b6ad9d4a2c5644f07beda54260519b6de43d03b096e822ecaef"

RPROVIDES:${PN} += "libmumps-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-mvapich2-hpc"

inherit rpm
