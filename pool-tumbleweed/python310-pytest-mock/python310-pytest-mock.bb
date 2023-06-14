SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python310-pytest-mock-3.10.0-2.1.noarch.rpm"
RPM_HASH = "95e75eac0e52919bd7e2221065628fae9fe1c1f3b538dec3fdc477827f46a5b9a4c85a72700329f161cddac042ab7a834f450540ec7d6137d8a3fbe669c3b750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mock \
python3.10dist-pytest-mock \
python310-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
