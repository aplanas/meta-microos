SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python310-OWSLib-0.28.1-1.2.noarch.rpm"
RPM_HASH = "0c6ff6975bcc25528ec5f9d7854e5e6eb04eb52a84309995dbc34f7314aafb39ae40789914619f8997cf1b8e1f6d9a3601809804243f344a8770681b06634728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OWSLib \
python3-owslib \
python3.10dist-owslib \
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
