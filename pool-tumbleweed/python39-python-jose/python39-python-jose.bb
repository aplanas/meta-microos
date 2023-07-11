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

RPM_NAME = "python39-python-jose-3.3.0-2.2.noarch.rpm"
RPM_HASH = "087bd85d9201199d6416aa56c265f09154ced88fc366962588ccf234c736556ed160858ef698b25d32e7298b5dd5e7d2a0fb4cbac8f357e54f191548d4d0aff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-jose \
python39-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python39-ecdsa \
python39-pyasn1 \
python39-rsa"

inherit rpm
