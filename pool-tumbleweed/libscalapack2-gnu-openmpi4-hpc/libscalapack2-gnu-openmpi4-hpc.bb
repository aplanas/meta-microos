SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi4-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi4-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi4-hpc-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "2970af2c200d4886d704539f906c4798e8bab136d240d4598a68430d3efadfb4775f4aae814153d5e25307f519a5a313085d5aac2b1309c447361482fe4d98d9"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
libscalapack2-2-1-0-gnu-openmpi4-hpc"

inherit rpm
