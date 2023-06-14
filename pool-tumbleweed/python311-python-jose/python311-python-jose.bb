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

RPM_NAME = "python311-python-jose-3.3.0-1.5.noarch.rpm"
RPM_HASH = "04009757361acb14c18c3b30221d7fe79aa4f0a456135a87d90ec7a156b55a48b5b1fd2a033c3ce985e8065832a99bf7c91fc8ad19e9deb021206c41b698fe6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-jose \
python311-python-jose \
python3dist-python-jose"

RDEPENDS:${PN} += "python-abi \
python311-ecdsa \
python311-pyasn1 \
python311-rsa"

inherit rpm
