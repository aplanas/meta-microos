SUMMARY = "Development headers for Boost.Thread library"
DESCRIPTION = "This package contains development headers for Boost.Thread library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_thread-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "8d14e2df0a2ec8273410c5b542d5afc237dbb80b0af184a5744efecae20201f0fad1f4422b2da81256ad70474d446de824c48dd5f78203c8c1577270c65e0263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-thread-devel"

RDEPENDS:${PN} += "libboost-thread1-82-0-devel"

inherit rpm
