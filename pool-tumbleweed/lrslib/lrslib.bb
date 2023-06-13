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

RPM_NAME = "lrslib-7.2-1.3.aarch64.rpm"
RPM_HASH = "443f462764f764f38f9928832b46daa969e025482f3b051b407f8aced629699a5c648c66b442bc928d06bd56dbe9dd6b20ba397745386ff13adcc2b56dca7080"

RPROVIDES:${PN} += "lrslib \
lrslib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
liblrs.so.1()(64bit)"

inherit rpm
