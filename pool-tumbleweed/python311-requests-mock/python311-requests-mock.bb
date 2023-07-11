SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python311-requests-mock-1.10.0-3.3.noarch.rpm"
RPM_HASH = "a729130dadfc84fdcade495aa2f1dbb68ba40a15c2cfe72823d9c58379d46fc6f407425d2dc19ffff95b036a7432ee98201df111b25573a3c8f5b264b8cdd8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-mock \
python3.11dist-requests-mock \
python311-requests-mock \
python3dist-requests-mock"

RDEPENDS:${PN} += "python-abi \
python311-dbm \
python311-requests \
python311-six"

inherit rpm
