SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python310-pytest-mock-3.11.1-1.1.noarch.rpm"
RPM_HASH = "5e5192744c70ce3b7719b767e0c540f05580e9f41e36223c4134513b99ddc5688ca142626c58755a56786c85281ea5b23a49de9124eea763fc8308ccfaf85e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mock \
python310-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
