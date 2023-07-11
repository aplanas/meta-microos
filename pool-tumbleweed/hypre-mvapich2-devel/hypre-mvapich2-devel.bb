SUMMARY = "Headers and library links for libHYPRE2_20_0-mvapich2"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-mvapich2-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "aee9c82dbb7c7e252a5cf6776596200505b661a6865f3cd2a71826ebee6ca4f8e421a0d2d6abeee4e7da2ed16a06c9f670c0e2957c5b667e049b00f2480c3df8"

RPROVIDES:${PN} += "hypre-mvapich2-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-mvapich2 \
superlu-devel"

inherit rpm
