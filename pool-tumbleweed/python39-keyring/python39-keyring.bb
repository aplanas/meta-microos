SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python39-keyring-24.2.0-2.1.noarch.rpm"
RPM_HASH = "0f5faa73f62844b3cb677a2dd68d51352cf942ac37988ee8f150c93903298465ee810a070113be76363a065896dff888f15f02a6f39155946b76d3f3d43a614c"
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
