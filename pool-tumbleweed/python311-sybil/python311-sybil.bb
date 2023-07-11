SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-sybil-3.0.0-4.3.noarch.rpm"
RPM_HASH = "41ca3d324e9f406d017b0088b5f7c5b2993cc0a1306d6949b82b4150ebc2fcb3d71a5b32044e5fb464c84f4d15a10f4b893d77db03d85d141d854d8833afd137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sybil \
python3.11dist-sybil \
python311-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
