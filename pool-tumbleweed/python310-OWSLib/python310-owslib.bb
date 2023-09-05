SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.29.2"

RPM_NAME = "python310-OWSLib-0.29.2-1.1.noarch.rpm"
RPM_HASH = "1683d4eb4e5cad37d5a2f4296d3107b4cd92ff79be949b677a57b45d7dbe9e085505746ed2b152048d65dd47af29f7e771acf59003b3ed8b3c980c5a650d9849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-owslib \
python310-OWSLib \
python310-owslib \
python3dist-owslib"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-lxml \
python310-python-dateutil \
python310-pytz \
python310-requests"

inherit rpm
