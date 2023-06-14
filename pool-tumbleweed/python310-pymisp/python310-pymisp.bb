SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python310-pymisp-2.4.166-1.4.noarch.rpm"
RPM_HASH = "8f033de9873c785ada6dabf8fee33f151b9eb6c3a47df878549864fa8a190862cc2992e60fe22e3640d806041d1c850e0e50d8ab48c2a0befb64af543d2cda74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymisp \
python3.10dist-pymisp \
python310-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-jsonschema \
python310-oletools \
python310-python-dateutil \
python310-requests"

inherit rpm
