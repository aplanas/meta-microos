SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python311-keyring-24.2.0-1.1.noarch.rpm"
RPM_HASH = "bda97a7f58d5cf436e8ef6030742c43d51f53028fc2a0fbc1612d9f514a8b3c228470967a472566e14e0dcde0715f59112bc98d2811105ce7cfb9b1d735c260d"
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
