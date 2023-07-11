SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-jaraco.test-5.3.0-1.3.noarch.rpm"
RPM_HASH = "ca87ca5d81c7e57a6c0e2b1211dddb1933c23b1a82536ed74d29b83dff8b41338c725bdc8fc59d3118f5d80aaa8aad5fe3c444d5ff367e5305f10b0934e9e9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.test \
python39-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.context \
python39-jaraco.functools"

inherit rpm
