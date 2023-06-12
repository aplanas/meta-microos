SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python39-azure-identity-1.13.0-1.1.noarch.rpm"
RPM_HASH = "38a8c43d62ce21e160c707f0cf63fab5a518cdd08c7926f9834f96e0cb26e6a210782d0d901884b5c2ce6d730d89c4bdcc41f424061f987b3bb94bebbb1c484e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-identity) \
python39-azure-identity \
python3dist(azure-identity)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-msal \
python39-msal-extensions \
python39-six"

inherit rpm
