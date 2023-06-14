SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-sybil-3.0.0-3.8.noarch.rpm"
RPM_HASH = "b8c07e1c611b6a58b0c51c14fa2ceb9c27a97368655ff8bf43a5e12de600de57e67682ed625de4815875c7eb368a3d5147cddbb506b0e35731e28b2bfbdba7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sybil \
python3.10dist-sybil \
python310-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
