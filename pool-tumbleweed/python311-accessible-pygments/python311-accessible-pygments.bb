SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python311-accessible-pygments-0.0.4-1.2.noarch.rpm"
RPM_HASH = "c07323e2c23ebc3e9511afa5732aa95f6d593ee9d3f3a9a1b7be75b0f186af8d5f068674d9e0e8081544887e8d82a13a9bc7b90b35c8f5c07fd2d8db8133d683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(accessible-pygments) \
python311-accessible-pygments \
python3dist(accessible-pygments)"
RDEPENDS:${PN} += "python(abi) \
python311-pygments"

inherit rpm
