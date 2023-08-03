SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-sybil-3.0.1-1.1.noarch.rpm"
RPM_HASH = "a54f04019367377a58b19c5d92611baee8ab62d0262c50222711fde150cac9de012d5cbb738a37e33ef8b0b944b240f711ecbebf9d5e91924326e5079de1957c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sybil \
python39-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
