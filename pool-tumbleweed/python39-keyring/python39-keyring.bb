SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python39-keyring-23.13.1-2.1.noarch.rpm"
RPM_HASH = "554ac5e0141898e33cb0fabccc3db149929781e2126398ae76e43367ff86ca8d0081717654f41a590c577bc8e9aed00f2a68de5da957ebe030a10370e6e3a7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(keyring) \
python39-keyring \
python3dist(keyring)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-SecretStorage \
python39-importlib-metadata \
python39-importlib-resources \
python39-jaraco.classes \
python39-jeepney \
update-alternatives"

inherit rpm
