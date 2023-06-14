SUMMARY = "Development headers for Boost"
DESCRIPTION = "Default version of Boost headers"
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "boost-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "f28e7bf7441b1e8a857a9106783e5869a9dc02ef3b1b41e8b0e81f4671cc75703cd23483bb6c409b5259bf8c5a8b5cdf140ae9054f6dea80c55794ed2865f544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-devel"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel"

inherit rpm
