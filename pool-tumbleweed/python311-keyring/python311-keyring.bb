SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python311-keyring-24.2.0-2.1.noarch.rpm"
RPM_HASH = "05d6f1e090b4455e0d4b8b2955815d30d4e32c01e3e30b6f9de2c9f0eac4c81d9193e0c0af01d04780ff91af21e54670fe37650a94f4a7dc6bf92262015dd2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring \
python3.11dist-keyring \
python311-keyring \
python3dist-keyring"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SecretStorage \
python311-importlib-metadata \
python311-jaraco.classes \
python311-jeepney \
update-alternatives"

inherit rpm
