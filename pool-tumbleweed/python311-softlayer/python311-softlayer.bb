SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python311-softlayer-6.1.4-1.3.aarch64.rpm"
RPM_HASH = "5b1690b197f8d3ce9d257a25bb4d5e19c93a56a083da5b38e3c7211c9f765be49ff837f74dd2aa8efeb7e691ff2fb38edfd8fda66f829f92ce2acb262ea15c70"

RPROVIDES:${PN} += "python3.11dist(softlayer) \
python311-softlayer \
python311-softlayer(aarch-64) \
python3dist(softlayer)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
python311-prettytable \
python311-prompt_toolkit \
python311-pygments \
python311-requests \
python311-rich \
python311-setuptools \
python311-softlayer-zeep \
python311-typing_extensions \
python311-urllib3 \
update-alternatives"

inherit rpm
