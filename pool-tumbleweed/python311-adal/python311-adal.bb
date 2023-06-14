SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python311-adal-1.2.7-1.9.noarch.rpm"
RPM_HASH = "9cb16e30c146fbe6f2f554dfe49c2f738396366d48a9197c4ca1d31dbab523e6eebf80c4e9411285f6fe4849b1da1b5f10bb2f50a6323f7c6d633907956672b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-adal \
python311-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-cryptography \
python311-python-dateutil \
python311-requests"

inherit rpm
