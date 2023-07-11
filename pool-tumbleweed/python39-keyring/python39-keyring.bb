SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python39-keyring-23.13.1-2.3.noarch.rpm"
RPM_HASH = "8dfffdaf34645b41dd1d32dc1f634ce2c2bc2fb3b4176b3211a52ff3fed0c8d6a64cc667879a054e9594eec59046bf82bae7d00a9677c128e89e5f42d2c3ab7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-keyring \
python39-keyring \
python3dist-keyring"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SecretStorage \
python39-importlib-metadata \
python39-importlib-resources \
python39-jaraco.classes \
python39-jeepney \
update-alternatives"

inherit rpm
