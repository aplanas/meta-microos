SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.29.2"

RPM_NAME = "python311-OWSLib-0.29.2-1.1.noarch.rpm"
RPM_HASH = "056d9ab03003ae3477d1250cd6a887cd4ee64aed991ceb9b60c3a7ad7a8a0a84e6944ca0007a2183a0a8a0c003e1369ca50bf3672342bf08b45375efc5e083a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OWSLib \
python3-owslib \
python3.11dist-owslib \
python311-OWSLib \
python311-owslib \
python3dist-owslib"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-lxml \
python311-python-dateutil \
python311-pytz \
python311-requests"

inherit rpm
