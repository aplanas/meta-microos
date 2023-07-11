SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python310-keyring-23.13.1-2.3.noarch.rpm"
RPM_HASH = "70810529edd31a7e981dae690dd742ec799f05852a005c90a43e1d192ff4b06d2b85ebdb350332a207dd6d8b1053839e4a3bfce790511617a1ef3879db59043e"
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
