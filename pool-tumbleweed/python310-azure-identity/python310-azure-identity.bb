SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-azure-identity-1.14.0-1.1.noarch.rpm"
RPM_HASH = "81938ea95b5d82e1c317a7b0aaaa4ae3a0b0e26c71ed78584d5e75e3dfdb7ec1c643245a29997e7fc5869aebb57aefc901aed376e4a1e230f457e0cf14e43c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-identity \
python310-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-msal \
python310-msal-extensions"

inherit rpm
