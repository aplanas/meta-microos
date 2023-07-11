SUMMARY = "Reverse Search Vertex Enumeration program"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. Input file formats are compatible with the \
cddlib package. All computations are done exactly in either \
multiple precision or fixed integer arithmetic. Output is not stored \
in memory, so even problems with very large output sizes can \
sometimes be solved."
LICENSE = "GPL-2.0-or-later"

PV = "7.2"

RPM_NAME = "lrslib-7.2-1.4.aarch64.rpm"
RPM_HASH = "36e8c24878e3c936bbe1032a38fd7c9b6d52a6bf36bafa3d3f8a9540954c5c26f85d189f861feb3962fc1b9e1ab2cd7afbc54c2b077bdc192592dadf80d0a9fa"

RPROVIDES:${PN} += "lrslib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
liblrs.so.1"

inherit rpm
