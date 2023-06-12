SUMMARY = "Development headers for Boost.Container"
DESCRIPTION = "Development header files and libraries for Boost.Container. \
Boost.Container library implements several well-known containers, \
including STL containers. The aim of the library is to offers advanced \
features not present in standard containers or to offer the latest \
standard draft features for compilers that don't comply with the latest \
C++ standard."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_container1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "9f2792c2718755883482c2dfd6faea15b4e949e331a185eb0f7d35abeb5ea4e163f69aa9d62bc6f2eed61db9cf54e299a26dc5d8c007420b299e473a473afc19"

RPROVIDES:${PN} += "libboost_container-devel-impl \
libboost_container1_82_0-devel \
libboost_container1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_container1_82_0 \
libboost_headers1_82_0-devel \
libstdc++-devel"

inherit rpm
