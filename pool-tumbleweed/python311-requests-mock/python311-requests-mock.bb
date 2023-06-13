SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python311-requests-mock-1.10.0-3.1.noarch.rpm"
RPM_HASH = "739df5636f963c638ca666f4ad8deebb3e61aa036ecc7df43319b8fad3c5d8829e20ef14876eb3fd878eb040f0157245c3a74846c0f2e6111257a338ccd143dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-mock) \
python311-requests-mock \
python3dist(requests-mock)"

RDEPENDS:${PN} += "python(abi) \
python311-dbm \
python311-requests \
python311-six"

inherit rpm
