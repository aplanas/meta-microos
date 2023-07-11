SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi3"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi3 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi3-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "5d39cab1f5d04b1e8559cbb92042715dda0b3921da95be2daac7e306297acccec942daf296e22507080f3d2f6bc6e6035ecfbb847ea6c21844b2955d80484176"

RPROVIDES:${PN} += "hypre-openmpi3-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-openmpi3 \
superlu-devel"

inherit rpm
