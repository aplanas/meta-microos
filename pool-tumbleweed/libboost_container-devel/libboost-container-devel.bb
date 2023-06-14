SUMMARY = "Development headers for Boost.Container"
DESCRIPTION = "Development header files and libraries for Boost.Container. \
Boost.Container library implements several well-known containers, \
including STL containers. The aim of the library is to offers advanced \
features not present in standard containers or to offer the latest \
standard draft features for compilers that don't comply with the latest \
C++ standard. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_container-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "0e963f949af196fb23e4db5eff836b54e6d11526715dd841250802ee29971ba389181cd688dd3f2908756cccd32a3ab346e7fc65033ef421ad274a19ef36edf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-container-devel"

RDEPENDS:${PN} += "libboost-container1-82-0-devel"

inherit rpm
