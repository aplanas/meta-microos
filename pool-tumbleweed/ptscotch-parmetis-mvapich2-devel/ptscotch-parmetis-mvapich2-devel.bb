SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-mvapich2-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "ecdde9cc5891a1b5811ec0a3de7261f4ffcb9d2990292b4a8cea1f77bf9c5005089443d428b3d6284b929cc28124de0ff8993aa685345e216af4268618807733"

RPROVIDES:${PN} += "ptscotch-parmetis-mvapich2-devel"

RDEPENDS:${PN} += "libptscotch0-mvapich2 \
ptscotch-mvapich2-devel"

inherit rpm
