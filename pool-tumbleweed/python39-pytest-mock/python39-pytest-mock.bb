SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python39-pytest-mock-3.10.0-2.3.noarch.rpm"
RPM_HASH = "adc2872d55f00c2ba3e176e577b9315509f8d87b97158c3db04a72d930832229374fa13680680bb40775400a9dd49fce50c9e01d3ba41756c38f4a200b5e10d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mock \
python39-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
