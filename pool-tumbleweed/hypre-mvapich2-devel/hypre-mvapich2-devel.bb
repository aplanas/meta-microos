SUMMARY = "Headers and library links for libHYPRE2_20_0-mvapich2"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-mvapich2-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "cff4e1c379216bbc0fab96b4c781a68aa00da1e95187869d3864b73974172a997c7fbf2e3377601a3a04c49791d9547105ea9fa1a8fa99fe3b7cb7f8c7a34d0c"

RPROVIDES:${PN} += "hypre-mvapich2-devel \
hypre-mvapich2-devel(aarch-64)"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2_20_0-mvapich2 \
superlu-devel"

inherit rpm
