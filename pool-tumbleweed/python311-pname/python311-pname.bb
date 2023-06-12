SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-pname-1.0.2-1.13.noarch.rpm"
RPM_HASH = "45c1465f39a5ea27d49fa1b1f7de0678a94e9ac8815309c7a793d5e9ff7f5e954bd91485d68ece1b774a1ee7653abb9d561dfcc8f3ad94c6230a344241e4458e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pname) \
python311-pname \
python3dist(pname)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
