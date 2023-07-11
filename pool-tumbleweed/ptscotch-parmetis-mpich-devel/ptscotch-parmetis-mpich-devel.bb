SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-mpich-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "0521715f716238fe256fe67ceb5577ba9a93bc096277ee6d0725d255c01c7c3cf904228f374db0556e14fa8815325c046f493bef90a03174c601e6e22298c5aa"

RPROVIDES:${PN} += "ptscotch-parmetis-mpich-devel"

RDEPENDS:${PN} += "libptscotch0-mpich \
ptscotch-mpich-devel"

inherit rpm
