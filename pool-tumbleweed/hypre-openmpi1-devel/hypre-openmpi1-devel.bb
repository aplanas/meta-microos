SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi1"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi1-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "c98c2a692c98954d2b279a3429ea68edf56d51a9d2a30de1ef2fc43298a68c085a1d3a09ba2467004bfd619837e42f5abe688e039d24ecc4e065b8c4a9736888"

RPROVIDES:${PN} += "hypre-openmpi1-devel \
hypre-openmpi1-devel(aarch-64)"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2_20_0-openmpi1 \
superlu-devel"

inherit rpm
