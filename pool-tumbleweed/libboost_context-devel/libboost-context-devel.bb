SUMMARY = "Development headers for Boost.Context"
DESCRIPTION = "Development headers and libraries for Boost.Context, a library that \
providing cooperative multitasking support. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_context-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "12538ba9ff44ca77b3a2dd385a3e8d3a4acd80a1ef2bbd5a74033659fbfe17cfa2392f5bad011e0f2a42627561b220995a4810aedee2c58cfacc92a6d2d5353a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_context-devel"

RDEPENDS:${PN} += "libboost_context1_82_0-devel"

inherit rpm
