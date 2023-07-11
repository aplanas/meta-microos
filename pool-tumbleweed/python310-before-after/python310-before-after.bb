SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python310-before-after-1.0.1-3.1.noarch.rpm"
RPM_HASH = "a1e72ebd85522e3ff16b82b0cf3d103cb975d7a0901dab626e74f16ff084612e4b2a40a83dc32aad48fda5fe0cdf2ba89a3454157d76a17628d608db0fe97b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-before-after \
python310-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
