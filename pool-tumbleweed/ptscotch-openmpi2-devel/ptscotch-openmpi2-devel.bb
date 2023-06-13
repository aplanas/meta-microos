SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "2e1af7b0cdbdec462130f4d15831537e10d0a8389ef007c53a23a916422779d207b7399c27f0ed00ba21bb07ff80095b16dc124e3fcdad3fdc69061c7340aa07"

RPROVIDES:${PN} += "ptscotch-openmpi2-devel \
ptscotch-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi2 \
openmpi2-devel \
scotch-devel"

inherit rpm
