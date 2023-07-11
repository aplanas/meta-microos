SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python39-requests-mock-1.10.0-3.3.noarch.rpm"
RPM_HASH = "68c8f9b36069cdbc60b85876a1538e042ba7e636761484a648618614b76bc19ed305bea2bd58f79b27c4e38c1ba5f04e664b9e0ba358fe5cd47a75b46cde8753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-mock \
python39-requests-mock \
python3dist-requests-mock"

RDEPENDS:${PN} += "python-abi \
python39-dbm \
python39-requests \
python39-six"

inherit rpm
