SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel-static provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-static-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "9c417bcf7fdf36b67ebfc2ae40672f76848b2d6948f9db3a51882b5bc9ddb6511d458f5d1f7249cad8fda19d6cee3f48765df912af127ee4bee594486469eb55"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel-static \
mpich-ofi-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "mpich-ofi_4_0_2-gnu-hpc-devel-static"

inherit rpm
