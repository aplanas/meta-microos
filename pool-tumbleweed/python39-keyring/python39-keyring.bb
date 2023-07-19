SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "24.2.0"

RPM_NAME = "python39-keyring-24.2.0-1.1.noarch.rpm"
RPM_HASH = "622d1a19a1e193b2f5f0797469bed6f6cd88a915c48e3f2ae5d61e3b80d662551f778486c5b66c6f99632f13171394aa0c30aac2624646229762b53d075bb39d"
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
