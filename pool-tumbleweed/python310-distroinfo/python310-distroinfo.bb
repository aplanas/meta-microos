SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python310-distroinfo-0.6.2-1.4.noarch.rpm"
RPM_HASH = "49a8a4a4f22199c6c92c66725d6c301451f130daa58027cb21ae7bea63480e2e7a3bece90d4d9f5db2e606e740956ec54136dfc4d93ed7f370252bedf644bd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distroinfo \
python310-distroinfo \
python3dist-distroinfo"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-pbr \
python310-requests \
python310-six"

inherit rpm
