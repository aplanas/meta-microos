SUMMARY = "Development files for bliss, a math library"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the Bliss library."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-devel-0.77-1.8.aarch64.rpm"
RPM_HASH = "6dee77ce1db697d838f84cdf73fb22461507979fd6fb4f3c04f3b034a4a294576c4850a8a3bcd16a1b877dacd58eaef4a4d699545e592135d870b228907e9cec"

RPROVIDES:${PN} += "bliss-devel \
bliss-devel(aarch-64)"
RDEPENDS:${PN} += "libbliss0_77"

inherit rpm
