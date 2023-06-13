SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python311-OWSLib-0.28.1-1.2.noarch.rpm"
RPM_HASH = "69e65ba3797f1ea4b1fb595c1051c7f8a40bba5d04558c4d5174765cadcfd1b089bde3e1b17b8cb73136bc0aa39eefeac833d1f1de11316b6d8878e276533697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(owslib) \
python311-OWSLib \
python311-owslib \
python3dist(owslib)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-lxml \
python311-python-dateutil \
python311-pytz \
python311-requests"

inherit rpm
