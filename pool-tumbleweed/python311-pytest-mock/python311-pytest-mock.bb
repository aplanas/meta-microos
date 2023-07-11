SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python311-pytest-mock-3.10.0-2.3.noarch.rpm"
RPM_HASH = "d1d95af23084c2c0ed50b8dc07324b171850840a17c3fad4a248d4eea438ae4e5def2b86910315efebe9ca6d9571333bced44d169fcd229753b54c1f44be1a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mock \
python3.11dist-pytest-mock \
python311-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
