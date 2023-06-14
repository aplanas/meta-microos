SUMMARY = "Development headers for Boost.Graph parallel library"
DESCRIPTION = "Development headers for Boost.Graph parallel boost library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "ec403f3ddfb2a74287fa287903e306a59652ceee61752cc5f6f847e61eee53ba41f9d4774d62d502c175370541f45c8eb2bab25d23969b9cf2cbb1d24bf48c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-graph-parallel-devel"

RDEPENDS:${PN} += "libboost-graph-parallel1-82-0-devel"

inherit rpm
