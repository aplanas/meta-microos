SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi2-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "d68b30d92676d04435346e10ac286db072e8b75cb138ee4b55cece7838936de6073005123c6b07f21f01774f07081d4d9407f69234d54b12c94bc04a5bf302bd"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi2-hpc"

inherit rpm
