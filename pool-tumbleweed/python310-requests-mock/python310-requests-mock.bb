SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python310-requests-mock-1.10.0-3.3.noarch.rpm"
RPM_HASH = "feca61ea5ab3174ccb52c36bf94fc3738b12def258451283860fd5b94e18293d0853b0feb40efdc226221b02bb9c9694565e725496fe6af26cf90b5bba33a8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-mock \
python310-requests-mock \
python3dist-requests-mock"

RDEPENDS:${PN} += "python-abi \
python310-dbm \
python310-requests \
python310-six"

inherit rpm
