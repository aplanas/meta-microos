SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python311-pytest-mock-3.10.0-2.1.noarch.rpm"
RPM_HASH = "e6ff1be82718fc36563f0382cd68716aed912a8d45a9c270787d4f416bcc754ebb3c2233305267d9a4ca305ea6436028dd25a68699bae3888c4b16fe2713bf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-mock \
python311-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
