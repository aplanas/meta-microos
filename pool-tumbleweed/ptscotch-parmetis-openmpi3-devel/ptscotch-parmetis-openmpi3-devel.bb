SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi3-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a210b05bb7ca32bc2a9eb490ca66af91bcb50fb8865731608d56363f56ad7a09edb3a74ad6013227e88fb1f0b95f3daa79ff7bff5111f52d878e3b07b50bc6b1"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi3-devel"

RDEPENDS:${PN} += "libptscotch0-openmpi3 \
ptscotch-openmpi3-devel"

inherit rpm
