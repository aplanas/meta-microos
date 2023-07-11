SUMMARY = "Headers and library links for libHYPRE2_20_0-mpich"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-mpich-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "0f26c2e90ba429189ac3c8748e3818038621406e47e77bb1ce9ea8f405a53817c9a85a13af3b6cc52f4d4f73f1a67e3ff7b9a7720e16a76b48189c2f85a3b3a5"

RPROVIDES:${PN} += "hypre-mpich-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-mpich \
superlu-devel"

inherit rpm
