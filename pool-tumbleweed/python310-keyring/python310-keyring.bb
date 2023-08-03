SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python310-keyring-24.2.0-2.1.noarch.rpm"
RPM_HASH = "d387b27573b304ba48a2d73132bcc0d4e8ed4f1e4d0a357a4b786ec3ec02a69a967b59112a8a83bdd02821a2b7f5245f9b8ea0264cbdaad3faae82b3de7f29a1"
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
