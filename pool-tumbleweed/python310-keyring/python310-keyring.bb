SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python310-keyring-24.2.0-1.1.noarch.rpm"
RPM_HASH = "ad8145af954b51217ca807e8363f1a6ab066ee519fea4aac41bf7ed5ef07ee0da9b33e2f89cfd1574ebd8c0a073b78d7ac312970caf090a4f06909aa5780005e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-keyring \
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
