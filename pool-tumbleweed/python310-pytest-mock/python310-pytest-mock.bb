SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python310-pytest-mock-3.10.0-2.3.noarch.rpm"
RPM_HASH = "b9b40d088ef612236b6f54cb9b47ce6479faa4a1292323ece176faf3301beb95b689a93ee1c5407f9fa369d09d74c96e1bd37303f8d1dca224a7628e27ea55c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mock \
python310-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
