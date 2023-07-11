SUMMARY = "Reverse Search Vertex Enumeration library"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. Input file formats are compatible with the \
cddlib package. Computations are done in multiprecision \
arithmetic."
LICENSE = "GPL-2.0-or-later"

PV = "7.2"

RPM_NAME = "liblrs1-7.2-1.4.aarch64.rpm"
RPM_HASH = "b7974591d87b436b2f6432f30abb0fd4760b123b81f48e36dd41a7c14dd84a4d8ea0a01970c21b0eb2e7dd8d08df86cd523d3ad963ca5758888b7cd83a43a096"

RPROVIDES:${PN} += "liblrs.so.1 \
liblrs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
