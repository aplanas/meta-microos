SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-jaraco.test-5.3.0-1.3.noarch.rpm"
RPM_HASH = "b4ef3bb1b8aaa1d498377031b6ddae9c1776f6ec01d1d4d5c6ce658a5d9c48b2cd2f5b66c2e9006f42b8877e36f38105215f8750b25e7eabd00dd3b1c56429cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.test \
python310-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.context \
python310-jaraco.functools"

inherit rpm
