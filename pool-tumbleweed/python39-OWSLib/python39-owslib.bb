SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python39-OWSLib-0.28.1-1.4.noarch.rpm"
RPM_HASH = "3e92660c1516c3e6549e9a2bacf27dd8e31e2bce2292515e074ea4126231884bc9c26f6f378ca584535046a5d36986d1b9f8c9d41e741851c55538124f3cb5cb"
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
