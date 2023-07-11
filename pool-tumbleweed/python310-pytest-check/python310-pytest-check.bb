SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-pytest-check-1.0.5-1.10.noarch.rpm"
RPM_HASH = "28d37bc3644fe3d64597b58c605674a03f79ddfe08f3bb1b72ea871ccfbb2829dd2b2fd433428be12e17b859ea2d4d201d94451caab4929ea18ba3015158834e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-check \
python310-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
