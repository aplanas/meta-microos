SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python311-OWSLib-0.28.1-1.4.noarch.rpm"
RPM_HASH = "d4ee4b1287c0cf4c8d21e9b24dc8450e46d5726809186b3ff6568bce9c7afd25bd6ca425c7e5b5c9c87a1046e24d6cc1f35be42eb29f1c383fbe41f89cf319bd"
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
