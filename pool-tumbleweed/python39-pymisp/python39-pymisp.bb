SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python39-pymisp-2.4.166-1.5.noarch.rpm"
RPM_HASH = "42c30cf8e9773dd156efca9a6f4a69ae794c617e52f8ac7d818fc0456dfecbf068e9b489eb70ad825a5ca87e17ddaa0324a409b2b04eb49c67d315c58e1a6fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymisp \
python39-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-jsonschema \
python39-oletools \
python39-python-dateutil \
python39-requests"

inherit rpm
