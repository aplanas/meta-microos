SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python310-azure-identity-1.13.0-1.2.noarch.rpm"
RPM_HASH = "bfede68934b294fef55497bd12750341040f725105e30a1015250641e60ac09f3ea76ecd11c39b830775ff32c7dd42ff02812f9aedff33f9bb5c353288999ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-identity \
python310-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-msal \
python310-msal-extensions \
python310-six"

inherit rpm
