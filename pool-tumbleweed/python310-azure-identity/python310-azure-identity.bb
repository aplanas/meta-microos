SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python310-azure-identity-1.13.0-1.1.noarch.rpm"
RPM_HASH = "0ea321ca9b7dd124e9aacd9ab70ba0beac534efeeff34606f523a01d9b328fcecc5667004fe9376f22f3d73471f306c0d9f629ba6d889a853cad555fe8090ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-identity \
python3.10dist(azure-identity) \
python310-azure-identity \
python3dist(azure-identity)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-msal \
python310-msal-extensions \
python310-six"

inherit rpm
