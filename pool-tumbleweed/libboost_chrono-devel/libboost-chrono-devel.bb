SUMMARY = "Development headers for Boost.Chrono library"
DESCRIPTION = "This package contains Boost.Chrono development headers. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_chrono-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "760f601fede841e709899eac293d2b5a4d3b0ac8471bc058948729288c52963e8fbb9bd78fe2d87008db308842349ec8ea239fc82146c9d7447bd173c45f81f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-chrono-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0-devel"

inherit rpm
