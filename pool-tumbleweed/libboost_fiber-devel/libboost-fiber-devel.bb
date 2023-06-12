SUMMARY = "Development headers for Boost.Fiber library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.Fiber library. Boost.Fiber is a cooperative multi-tasking \
userland threading library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_fiber-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "08a9bc4b7b0d07576aceca371a0ae56443ce6769602ad6085359ae43e39828c8539c3c1e546d5b3f8b0221605569dea366e1c2d740ecf2cafc8de162642abb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_fiber-devel"
RDEPENDS:${PN} += "libboost_fiber1_82_0-devel"

inherit rpm
