SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi3-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi3-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "e79969d35d7786eef5d0a8a20c06efd95c641f600073e821e35521b23ac35b4f9dde7e4244894720f4aca5d7e033d9fd52d6c632788481d66696fe196d2bbf97"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi3-hpc \
libHYPRE-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libHYPRE_2_20_0-gnu-openmpi3-hpc"

inherit rpm
