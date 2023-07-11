SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-greenlet-devel-2.0.2-1.3.noarch.rpm"
RPM_HASH = "166d77fbd810ac10e688d79126fb238fbde05d4b0c3d17709c68153a35348e2df712b31961bea3cd51d51d7646bc56b3ba9487eb7af07bc371e546deb8adefc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-greenlet-devel"

RDEPENDS:${PN} += "python310-greenlet"

inherit rpm
