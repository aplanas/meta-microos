SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python310-keyring-23.13.1-2.1.noarch.rpm"
RPM_HASH = "d65d66cde2fbe20ffb5ca1fc0295bb56e27b978752d242d0f8a268c4a9747fc75334eead05dcf1ae491a7fadf22b5a40ea59cc6d303522f995b806c31e5b18d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring \
python3.10dist-keyring \
python310-keyring \
python3dist-keyring"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SecretStorage \
python310-importlib-metadata \
python310-jaraco.classes \
python310-jeepney \
update-alternatives"

inherit rpm
