SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-jaraco.test-5.3.0-1.1.noarch.rpm"
RPM_HASH = "4003e24246b9c8b047894dfc559f8af94f1284f7d3b3d71140bc1338c4a29fb84b5c98b19adcd366306fcca4bc0669342ae057ea84862bb53ef427409479076f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.test \
python3.10dist-jaraco.test \
python310-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.context \
python310-jaraco.functools"

inherit rpm
