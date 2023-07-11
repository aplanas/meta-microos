SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.166"

RPM_NAME = "python310-pymisp-2.4.166-1.5.noarch.rpm"
RPM_HASH = "cf2673cd564625741598d7ac3b2e06065241ca8c19a85fcaccdeb8a23fe5a726bcf4851f753890aa70326933bf29b15a2b19321a8ba2d0741a49f33ae6a6630e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymisp \
python310-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-jsonschema \
python310-oletools \
python310-python-dateutil \
python310-requests"

inherit rpm
