SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python311-adal-1.2.7-1.11.noarch.rpm"
RPM_HASH = "209764e2f4a5ad368c8f8481de59eade38e54c7aab6a7d6a0a3f53ddec3b0fd4c4cc63547ac452ffa99f5a1aac0d4b224ee0c9933318a7f554ab223f1c24069a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adal \
python3.11dist-adal \
python311-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-cryptography \
python311-python-dateutil \
python311-requests"

inherit rpm
