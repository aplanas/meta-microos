SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-azure-identity-1.14.0-1.1.noarch.rpm"
RPM_HASH = "f7f121adf36f1557fa6f62b90767957f4b76124b86cbd427bca5c5172d077e92a030690210b497e1dba1e8fdd74b534be188ded760e5147cd78f744b9d64984f"
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
python311-msal-extensions"

inherit rpm
