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

RPM_NAME = "python39-python-jose-3.3.0-1.5.noarch.rpm"
RPM_HASH = "8fd5990be4e76bb0d84ca649cdd5c45c55e5fb7a2664a03e7f7b9896aaa8517216777b67e03177c192e5df6ac377474ce3483590d769234c6273dd9c7037bb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-jose \
python39-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python39-ecdsa \
python39-pyasn1 \
python39-rsa"

inherit rpm
