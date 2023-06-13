SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-retryrequests-0.2.0-1.3.noarch.rpm"
RPM_HASH = "f730cb1b1570385f1fae678e4e8b7cca6d3fb2e3cfd60b03ffc2ff0a51db2766fcebb306e3a74820fd3f9dfe0b5686668b9276d188e642d2ef2953744e9abf06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retryrequests \
python3.10dist(retryrequests) \
python310-retryrequests \
python3dist(retryrequests)"

RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-setuptools"

inherit rpm
