SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python310-pytest-base-url-2.0.0-1.9.noarch.rpm"
RPM_HASH = "eee3160716bd3ef42181d7564f38a4d6e02d90165ef2c5823ae255a0204ca6aab17ffba3dff241281615ab2f93f9a67926f44b8da2d07f99e20da02e1b137995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-base-url \
python3.10dist(pytest-base-url) \
python310-pytest-base-url \
python3dist(pytest-base-url)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-requests"

inherit rpm
