SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-retryrequests-0.2.0-1.5.noarch.rpm"
RPM_HASH = "3df94199c012335f4fbd3915a757065b98c438a275ec37f4e881bc9e3b5ae8e75557b988d68af7e82a6a1e93f9fd5012cb75b60dd924d0f1787337eec38a3e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retryrequests \
python3.11dist-retryrequests \
python311-retryrequests \
python3dist-retryrequests"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-setuptools"

inherit rpm
