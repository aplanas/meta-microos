SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-retryrequests-0.2.0-1.5.noarch.rpm"
RPM_HASH = "9a81ede26a84f9a2bf465168690c8f5f9c5e6251f96d7c7373ee9ba672f6bdbffa8d68d64b66a1615eb37413dd257e8cf2c6479927654445edefbf7592a51c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-retryrequests \
python310-retryrequests \
python3dist-retryrequests"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-setuptools"

inherit rpm
