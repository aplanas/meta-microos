SUMMARY = "JOSE implementation in Python"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements different cryptographic backends. \
Consuming python packages must select the backend as an extra \
when installing python-jose. RPM packages must select the \
corresponding rpm subpackage. If no backend is selected, the \
main package uses the native-python backend."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-python-jose-3.3.0-1.5.noarch.rpm"
RPM_HASH = "4fb44e8c2fdc4a043c7db967b3dd73a6bcdbc26f6721c5d17bcca23e166dbe4db034845247401790fbfffbfcd291b284070c22bc30ea57617cd3eb815296e2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jose \
python3.10dist-python-jose \
python310-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python310-ecdsa \
python310-pyasn1 \
python310-rsa"

inherit rpm
