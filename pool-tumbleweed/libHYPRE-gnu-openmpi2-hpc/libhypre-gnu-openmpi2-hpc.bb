SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi2-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "74f6557f4805eac258cc022ed38e04e3f484536c7c18337c697fc87e6aadf2cffe8cd4467297961c59bff5c1b6302f0f3b06a9008bb6929f57546bfe668381c2"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-openmpi2-hpc"

inherit rpm
