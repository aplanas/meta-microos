SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python311-pytest-mock-3.11.1-1.1.noarch.rpm"
RPM_HASH = "edbb8e21a0e8830816abc30347045f503744eb7b3954e0d08820e349c35f873ca7b6c5b241c5f68a39d861e27e93f41786ed266f0d6004d3f803e5140fa07fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mock \
python3.11dist-pytest-mock \
python311-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
