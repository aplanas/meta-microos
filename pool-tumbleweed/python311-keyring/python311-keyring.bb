SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python311-keyring-23.13.1-2.3.noarch.rpm"
RPM_HASH = "0e557c5d7156fafa0b523f61aa2ffcb7edd4ed9eb861f4d8bcb94b013c8f3e8392df929aa9a851b716232a4fdd5fa91a82bb769a5f6361f1c6afb12c97b4ef22"
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
