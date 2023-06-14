SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "bd87e69fb58fd94f586f37be73308591e0d47181205065e08ad612269e730b60e3c98cc58f5c14091beb116e13c75527692fbf7705c498e5338fdcbbc8774501"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
