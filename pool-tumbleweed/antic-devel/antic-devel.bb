SUMMARY = "Development files for antic"
DESCRIPTION = "Antic is an algebraic number theory library. \
 \
This subpackage contains the include files and library links for \
developing against the ANTIC library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "antic-devel-0.2.5-2.2.aarch64.rpm"
RPM_HASH = "ded43bd7406fc5f829d3b99ab5d5576e27dd27d2b49776620356ee082f77063a0f103ab64e467847a68feebfb2ca5009cba6c8d335baed8c3005cbb860f163ee"

RPROVIDES:${PN} += "antic-devel"

RDEPENDS:${PN} += "flint-devel \
gmp-devel \
libantic0"

inherit rpm
