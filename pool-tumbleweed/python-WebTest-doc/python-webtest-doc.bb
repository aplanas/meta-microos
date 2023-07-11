SUMMARY = "Helper to test WSGI applications - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebTest."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python-WebTest-doc-3.0.0-4.3.noarch.rpm"
RPM_HASH = "569a31c1b6a5b73dc930f2f6cc1a8ea3df7e6d9414925667d08b928005b6d8b390ddfb1d3313c4895d4c238771093573d415f8e5d55f039e1980ba5de49002c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebTest-doc \
python310-WebTest-doc \
python311-WebTest-doc \
python39-WebTest-doc"

RDEPENDS:${PN} += ""

inherit rpm
