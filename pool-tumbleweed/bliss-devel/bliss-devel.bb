SUMMARY = "Development files for bliss, a math library"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the Bliss library."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-devel-0.77-1.9.aarch64.rpm"
RPM_HASH = "8c8b6b3b6952280059897830b61b612612e86f6d581b1afa0cb68c9c3452275e762d11edf279900727f6d63610c10fc664b076147cffa5de1f58df202d55ca3c"

RPROVIDES:${PN} += "bliss-devel"

RDEPENDS:${PN} += "libbliss0-77"

inherit rpm
