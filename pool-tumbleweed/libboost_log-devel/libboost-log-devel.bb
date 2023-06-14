SUMMARY = "Development headers for Boost.Log library"
DESCRIPTION = "Development headers for Boost.Log library which aims to make logging \
significantly easier for the application developer. It provides a wide \
range of out-of-the-box tools along with public interfaces for extending \
the library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_log-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "926e07bd723cbd43f4ee679482f7eacc8464103c8d40d8ced5c3623589425510fc134d338ad8b520f3b40a460e214f828f615b021d88cbaf343a4b0a5f2a9d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-log-devel"

RDEPENDS:${PN} += "libboost-log1-82-0-devel"

inherit rpm
