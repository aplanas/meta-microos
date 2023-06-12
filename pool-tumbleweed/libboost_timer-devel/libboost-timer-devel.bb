SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_timer-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "7463b3e57429658799786625f61ca5b31c21768de8be038e31b37b7c814bdc444b80098cba3575b627463c494ee570ab8088c2650932b8244de09d8fb6d3c4db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_timer-devel"
RDEPENDS:${PN} += "libboost_timer1_82_0-devel"

inherit rpm
