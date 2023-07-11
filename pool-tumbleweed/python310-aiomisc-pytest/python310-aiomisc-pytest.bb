SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-aiomisc-pytest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "cf1fff7e46619fce6e82a9ad5bb3f785995af9a0c85b42fa253b28cc7e03cc763bd86efd695574b40db70ea637fd6ee9d8629c98b114834bd721893da0449361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiomisc-pytest \
python310-aiomisc-pytest \
python3dist-aiomisc-pytest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
