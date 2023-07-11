SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python310-adal-1.2.7-1.11.noarch.rpm"
RPM_HASH = "23b853fa62d114fbf15e14efa04638c42a174171283ea3a61564d6fbe33468bfe38401bb7d4e092d0726f446df8548573262ebd70ef49b0fa5678bddba6fb184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-adal \
python310-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-cryptography \
python310-python-dateutil \
python310-requests"

inherit rpm
