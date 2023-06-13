SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-sybil-3.0.0-3.8.noarch.rpm"
RPM_HASH = "82098fb9c96722d3ed07af0a919ea567304ec75c16ec405d1ac2fc9608d4c71da51c6d8275d15a92e314a2b6c0bc6d640d35f6b9fa21f27a6db46624bd00fa3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sybil) \
python311-sybil \
python3dist(sybil)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
