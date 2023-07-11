SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python310-jaraco.context-4.3.0-1.3.noarch.rpm"
RPM_HASH = "be500e8978c1991dd2c9738f1a88279bb9498c3c436aa188f615c15bcafc98915feca8d42b89ca7d33e28cfade7034b6f8c818c7b64707875eac8b483bb8f87b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.context \
python310-jaraco.context \
python3dist-jaraco.context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
