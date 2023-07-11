SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python311-azure-identity-1.13.0-1.2.noarch.rpm"
RPM_HASH = "b9aa37feb5fbf9085d45c4c65fbdaf6e06d1ae0c0978b8033fdf43543747422cb14aeea021430e8effc0c73cecdf5ad220a3e79b80f9d98891f43cd5030472a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-identity \
python3.11dist-azure-identity \
python311-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-cryptography \
python311-msal \
python311-msal-extensions \
python311-six"

inherit rpm
