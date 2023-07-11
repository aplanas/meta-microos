SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python311-softlayer-6.1.4-2.1.aarch64.rpm"
RPM_HASH = "d7daf8bc7658cb40459e00bfd771c5a32765af786ee2a2fe8deaac7fb68f1de0fbae9cb413aef001bbada3c3906abe46ed2aa56a9ba0bc12808c34f05b4e561b"

RPROVIDES:${PN} += "python3-softlayer \
python3.11dist-softlayer \
python311-softlayer \
python3dist-softlayer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-prettytable \
python311-prompt-toolkit \
python311-pygments \
python311-requests \
python311-rich \
python311-setuptools \
python311-softlayer-zeep \
python311-typing-extensions \
python311-urllib3 \
update-alternatives"

inherit rpm
