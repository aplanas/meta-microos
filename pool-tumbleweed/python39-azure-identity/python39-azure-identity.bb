SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python39-azure-identity-1.13.0-1.2.noarch.rpm"
RPM_HASH = "d0acbb25ae73a977e81d4dc6a4f5ffd4fcaec6c27774bdd2296d25a65e9f040e7ddfbefd888d6dd2b3fbd43c6adfa4c4633b8b0a2da96ffa8e3be36a68e3d8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-identity \
python39-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-msal \
python39-msal-extensions \
python39-six"

inherit rpm
