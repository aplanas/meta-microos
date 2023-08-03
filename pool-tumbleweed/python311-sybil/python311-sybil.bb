SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-sybil-3.0.1-1.1.noarch.rpm"
RPM_HASH = "fd1f4269b9251f35885aca7707eca360618e4b543ca76d10075f2c3d2670480a2d33f5634010d20db625ca362aeca655f93a33aa27e1844c5448804993107387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sybil \
python3.11dist-sybil \
python311-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
