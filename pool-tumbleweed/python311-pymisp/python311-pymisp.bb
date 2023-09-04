SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.170.2"

RPM_NAME = "python311-pymisp-2.4.170.2-1.1.noarch.rpm"
RPM_HASH = "db5c8793415132832e5200dcfff2a6e3d34265de4ec1f05efcdf7aa2a085addff344ec8e0551b78a65b83b39160cc308e8c4e0ac29855eb779be685f0d0f6df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymisp \
python3.11dist-pymisp \
python311-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-jsonschema \
python311-python-dateutil \
python311-requests"

inherit rpm
