SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.170.2"

RPM_NAME = "python39-pymisp-2.4.170.2-1.1.noarch.rpm"
RPM_HASH = "9d518e0c16126a5a9211facc5b51d3db6cbbdb7feba150b8a5be89c98edd33eeeb84c7d9f1b97c23e9ad119d189d8890b93143fe178e01a2bfcb5053a638b1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymisp \
python39-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-jsonschema \
python39-python-dateutil \
python39-requests"

inherit rpm
