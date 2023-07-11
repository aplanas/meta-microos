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

RPM_NAME = "python311-python-jose-3.3.0-2.2.noarch.rpm"
RPM_HASH = "4371f80c4b5356ad42d7121ab6ecd3be1f73af78d850dded0b3eb1d209254bb56afbe41261491d461d5ec160b7a9d6abb70af3e3d3b1f7e216e0426c3b173e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jose \
python3.11dist-python-jose \
python311-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python311-ecdsa \
python311-pyasn1 \
python311-rsa"

inherit rpm
