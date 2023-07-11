SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python310-OWSLib-0.28.1-1.4.noarch.rpm"
RPM_HASH = "757194b9de63838136ba44f89e8ff38c2594e033e80236e47cd5300d40fd933137b0abf796568606162afeb76e2eafe528751ffb6fcd21f5fd545534bb23c30f"
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
