SUMMARY = "Development files for the Hawk Network Library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of hawknl."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-devel-1.6.8-1.23.aarch64.rpm"
RPM_HASH = "bfe3733f254673437ed5766aeca0682c60a86ae0472f02895bf7cbc38b8ff0260386bcfcdbe46402a05b18c434160e6437c07232b11f7bf7461115b54ce938aa"

RPROVIDES:${PN} += "hawknl-devel \
hawknl-devel(aarch-64)"

RDEPENDS:${PN} += "hawknl-libs"

inherit rpm
