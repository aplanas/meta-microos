SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python39-softlayer-6.1.4-2.1.aarch64.rpm"
RPM_HASH = "213438000541ae86b634220e6053f1ff661909342a32392b90ec6260cabfaf2829c1709e3689a5b6bb7cb9117865394fb8dd2ec4a4c67712cc9c19c5c8dd297c"

RPROVIDES:${PN} += "python3.9dist-softlayer \
python39-softlayer \
python3dist-softlayer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-prettytable \
python39-prompt-toolkit \
python39-pygments \
python39-requests \
python39-rich \
python39-setuptools \
python39-softlayer-zeep \
python39-typing-extensions \
python39-urllib3 \
update-alternatives"

inherit rpm
