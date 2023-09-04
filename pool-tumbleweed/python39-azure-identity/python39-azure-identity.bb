SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-azure-identity-1.14.0-1.1.noarch.rpm"
RPM_HASH = "85c9f85b97ca4d16515a749d1d9bf08160d0c822969cb0d94aa5c14cb868d8e8669cdae346475dabd3a57ac43e5314b4ff125a33dd08f93be215465d2ce41b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-identity \
python39-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-msal \
python39-msal-extensions"

inherit rpm
