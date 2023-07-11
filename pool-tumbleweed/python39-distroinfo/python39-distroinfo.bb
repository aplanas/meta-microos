SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python39-distroinfo-0.6.2-1.4.noarch.rpm"
RPM_HASH = "41f4b80be22c6cefd19228f18a45f3d16182e3def1d118603d4fb678f07258c6a69792ae6cd8de3362fa0a4451c30082d04279307348394906c75b8cef8bc7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distroinfo \
python39-distroinfo \
python3dist-distroinfo"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-pbr \
python39-requests \
python39-six"

inherit rpm
