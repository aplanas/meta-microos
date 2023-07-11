SUMMARY = "Development files for the Hawk Network Library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of hawknl."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-devel-1.6.8-1.24.aarch64.rpm"
RPM_HASH = "c8356a173686138f9c94a99cb47a10af50f5032455e6fd09706bd58072d8efa3a17c490ff767dcd03ed1e472f4a4f694d7b55e11725ac400c1a0a8a2a7d6c3c4"

RPROVIDES:${PN} += "hawknl-devel"

RDEPENDS:${PN} += "hawknl-libs"

inherit rpm
