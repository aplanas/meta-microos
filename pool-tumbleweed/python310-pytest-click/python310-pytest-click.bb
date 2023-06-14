SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pytest-click-1.1.0-1.6.noarch.rpm"
RPM_HASH = "4e10075f690d1741aea3afb627f58c0e260047b254bc1a136c87e1c20c00f67a663dd3c382a952a92d12bd3395f95a31436144802905029a32f62e039abd326e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-click \
python3.10dist-pytest-click \
python310-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-pytest"

inherit rpm
