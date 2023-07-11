SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-sybil-3.0.0-4.3.noarch.rpm"
RPM_HASH = "3f18b1afc9342c12a83af98bb4a1418de07e9a45018560e26126f2ae8fba200620c4d6a20db1f25c5b9d666b237159c093a3284ad1c06d608f00a489d811b478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sybil \
python310-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
