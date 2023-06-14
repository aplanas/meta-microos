SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python311-pymisp-2.4.166-1.4.noarch.rpm"
RPM_HASH = "77ccaa606dab8ef73a8a5c3ee39fc863b2cf4c4d8a955c67ee900bcc0ed32c233dda01280b9684340cac9239c4c974384cafb43cde393d42dd41abfafbc01850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymisp \
python311-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-jsonschema \
python311-oletools \
python311-python-dateutil \
python311-requests"

inherit rpm
