SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python310-PyFxA-0.7.7-3.7.noarch.rpm"
RPM_HASH = "10dcaa22665ea96fc9fc1f217bc54502bb9b8682255e7ab818d8c323c03d3b1d058efd9c2982c8fbb5a4dd8be71fe4e0ed4be945c1c4dc077c7691f432676869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyFxA \
python3.10dist-pyfxa \
python310-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyBrowserID \
python310-cryptography \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
