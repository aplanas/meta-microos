SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-sybil-3.0.0-4.3.noarch.rpm"
RPM_HASH = "b27407c51a6591d0f3ab0f2d53dfda945dcaa440dd7aa4efb2ca6be207d9a7b96ceed771c20166b5728fe75de2eb6b62a32d78219a10f4a2fd0e428f49cd9f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sybil \
python39-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
