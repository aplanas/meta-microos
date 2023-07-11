SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python310-softlayer-6.1.4-2.1.aarch64.rpm"
RPM_HASH = "8f13790dbf0d34c825cdb0c835167c9d1b2144748d87013a6dcc5d930c53e52d8f0dae223d3d008aab92205c4be2101ba7fed6007dcdc8cd060f246abff25759"

RPROVIDES:${PN} += "python3.10dist-softlayer \
python310-softlayer \
python3dist-softlayer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-prettytable \
python310-prompt-toolkit \
python310-pygments \
python310-requests \
python310-rich \
python310-setuptools \
python310-softlayer-zeep \
python310-typing-extensions \
python310-urllib3 \
update-alternatives"

inherit rpm
