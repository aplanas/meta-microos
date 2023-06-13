SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python39-softlayer-6.1.4-1.3.aarch64.rpm"
RPM_HASH = "31446353ca85b756fac15b3263fa74b4f47973b700b258ad352ceac192dc956f5310050633cfe9913ee6871d374307656a74a8bafe3b02bec20d9d426d8e34d0"

RPROVIDES:${PN} += "python3.9dist(softlayer) \
python39-softlayer \
python39-softlayer(aarch-64) \
python3dist(softlayer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
python39-prettytable \
python39-prompt_toolkit \
python39-pygments \
python39-requests \
python39-rich \
python39-setuptools \
python39-softlayer-zeep \
python39-typing_extensions \
python39-urllib3 \
update-alternatives"

inherit rpm
