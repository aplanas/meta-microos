SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python311-distroinfo-0.6.2-1.4.noarch.rpm"
RPM_HASH = "eefa3a602b4a096a44d68610cdd8c2b4ee4f115437b60d42f916b9f90bee52969647ce1499b133c57eeb9a7e5c817648bca4a7d8c7ebb2b52e93af25dbb1ba51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distroinfo \
python3.11dist-distroinfo \
python311-distroinfo \
python3dist-distroinfo"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-pbr \
python311-requests \
python311-six"

inherit rpm
