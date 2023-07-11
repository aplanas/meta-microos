SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python311-pymisp-2.4.166-1.5.noarch.rpm"
RPM_HASH = "713710509cfd57be27e92eb59a395c5410ff416ae3746b1d491060fb85db053387978db4d6a66dfa22ce59433538c278f2fec577cac41fdeb7a70fb6f2c59589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymisp \
python3.11dist-pymisp \
python311-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-jsonschema \
python311-oletools \
python311-python-dateutil \
python311-requests"

inherit rpm
