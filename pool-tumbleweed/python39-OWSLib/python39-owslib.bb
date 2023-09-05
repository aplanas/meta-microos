SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.29.2"

RPM_NAME = "python39-OWSLib-0.29.2-1.1.noarch.rpm"
RPM_HASH = "a8503e1eb536f8fbe88b8595c8fbb69a87b9a720fc1c3344c07e0a03c84a9762ff13a1e6733e3b971ee9636ae18e834e79674abf4a6d6e4e9d23ab64ab20fba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-owslib \
python39-OWSLib \
python39-owslib \
python3dist-owslib"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-lxml \
python39-python-dateutil \
python39-pytz \
python39-requests"

inherit rpm
