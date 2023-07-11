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

RPM_NAME = "python310-python-jose-3.3.0-2.2.noarch.rpm"
RPM_HASH = "2f99e2648fe8aa23967800ef297938c9b1c7441061e4905328f4bc121e140ce27b27f245fe817487fab07d28adb9670a708941408b98f51e191cc3303b14b48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-jose \
python310-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python310-ecdsa \
python310-pyasn1 \
python310-rsa"

inherit rpm
