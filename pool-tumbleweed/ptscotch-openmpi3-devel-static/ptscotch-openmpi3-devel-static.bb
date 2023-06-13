SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "0cd534e44d20e2555a678c04739ce5a05cf74be43622a9040a06683257fa872b823a07a88f565f7f3b5722461d57f3b49c3508b48723e28507226141c0ce8be5"

RPROVIDES:${PN} += "ptscotch-openmpi3-devel-static \
ptscotch-openmpi3-devel-static(aarch-64) \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi3-devel"

inherit rpm
